package com.apdserver.apdserver.core.contact;

import com.apdserver.apdserver.infra.contact.ContactEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactService implements ContactDriving{

    @Autowired
    private ContactDriven contactDriven;
    @Override
    public List<ContactDto> findAll() {

        return contactDriven.findAll();
    }

    @Override
    public ContactDto create(ContactDto dto) {

        return contactDriven.create(dto);
    }

    @Override
    public Optional<ContactEntity> findById(Integer id) {

        Optional<ContactEntity> checked = contactDriven.findById(id);
        if(checked.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Bad Gateway");
        }

        return contactDriven.findById(id);
    }

    @Override
    public ContactDto update(Integer id, ContactDto dto) {

        Optional<ContactEntity> checked = contactDriven.findById(id);
        if(checked.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Bad Gateway");
        }

        return contactDriven.update(id, dto);
    }

    @Override
    public ContactDto softDelete(Integer id) {

        Optional<ContactEntity> checked = contactDriven.findById(id);
        if(checked.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Bad Gateway");
        }

        return contactDriven.softDelete(id);
    }
}
