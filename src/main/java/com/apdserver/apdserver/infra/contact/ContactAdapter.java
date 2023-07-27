package com.apdserver.apdserver.infra.contact;

import com.apdserver.apdserver.core.contact.ContactDriven;
import com.apdserver.apdserver.core.contact.ContactDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ContactAdapter implements ContactDriven {

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ContactMapperInfra contactMapper;
    @Override
    public List<ContactDto> findAll() {

        return contactMapper.from(contactRepository.findAll());
    }

    @Override
    public ContactDto create(ContactDto dto) {
        ContactEntity contact = contactRepository.save(contactMapper.from(dto));
        return contactMapper.from(contact);
    }

    @Override
    public Optional<ContactEntity> findById(Integer id) {

        Optional<ContactEntity> contact = contactRepository.findById(id);
        return contact;
    }

    @Override
    public ContactDto update(Integer id, ContactDto dto) {

       ContactEntity contact = contactRepository.getById(id);
       contact.setPhone(dto.getPhone());
       contact.setSecondPhone(dto.getSecondPhone());
       contact.setEmail(dto.getEmail());
       contactRepository.save(contact);
       return contactMapper.from(contact);
    }

    @Override
    public ContactDto softDelete(Integer id) {
        ContactEntity contact = contactRepository.getById(id);
        contact.setDeleted(true);
        contactRepository.save(contact);
        return contactMapper.from(contact);
    }
}
