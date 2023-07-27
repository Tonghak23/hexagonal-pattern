package com.apdserver.apdserver.infra.contact;

import com.apdserver.apdserver.core.contact.ContactDto;

import java.util.List;

public interface ContactMapperInfra {
    List<ContactDto> from(List<ContactEntity> entities);
    ContactEntity from(ContactDto dto);
    ContactDto from(ContactEntity entity);

}
