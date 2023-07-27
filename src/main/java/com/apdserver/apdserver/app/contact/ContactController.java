package com.apdserver.apdserver.app.contact;

import com.apdserver.apdserver.core.contact.ContactDriving;
import com.apdserver.apdserver.core.contact.ContactDto;
import com.apdserver.apdserver.infra.contact.ContactEntity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactDriving contactDriving;
    @Autowired
    private ContactMapper contactMapper;

    @GetMapping("/contact")
    public ResponseEntity<List<ContactRespone>> findAll() {

        List<ContactRespone> respone = contactMapper.from(contactDriving.findAll());
        return new ResponseEntity<>(respone, HttpStatus.OK);
    }

    @PostMapping("/contact")
    public ResponseEntity<ContactRespone> create(@Valid @RequestBody ContactRequest request) {
        //request to dt
        ContactDto dto = contactMapper.from(request);
        //dto to response
        ContactRespone contact = contactMapper.from(contactDriving.create(dto));
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Optional<ContactEntity>> findOne(@PathVariable Integer id) {

        Optional<ContactEntity> contact = contactDriving.findById(id);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @PutMapping("/contact/{id}")
    public ResponseEntity<ContactRespone> update(@PathVariable Integer id, @Valid @RequestBody ContactRequest request) {

        //request to dt
        ContactDto dto = contactMapper.from(request);
        //dto to response
        ContactRespone contact = contactMapper.from(contactDriving.update(id, dto));
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }


    @PatchMapping("contact/{id}")
    public ResponseEntity<?> softDelete(@PathVariable Integer id) {
        contactDriving.softDelete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

