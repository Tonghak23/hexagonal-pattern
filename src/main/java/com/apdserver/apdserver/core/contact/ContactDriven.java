package com.apdserver.apdserver.core.contact;

import com.apdserver.apdserver.infra.contact.ContactEntity;

import java.util.List;
import java.util.Optional;

public interface  ContactDriven {

    List<ContactDto> findAll();
    ContactDto create(ContactDto dto);
    Optional<ContactEntity> findById(Integer id);
    ContactDto update(Integer id, ContactDto dto);
    ContactDto softDelete(Integer id);
}
