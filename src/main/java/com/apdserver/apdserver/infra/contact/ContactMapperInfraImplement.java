package com.apdserver.apdserver.infra.contact;

import com.apdserver.apdserver.core.contact.ContactDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactMapperInfraImplement implements ContactMapperInfra {
    @Override
    public ContactEntity from(ContactDto dto) {

       ContactEntity contactEntity = new ContactEntity();
       contactEntity.setPhone(dto.getPhone());
       contactEntity.setSecondPhone(dto.getSecondPhone());
       contactEntity.setEmail(dto.getEmail());
       return  contactEntity;
    }
    @Override
    public ContactDto from(ContactEntity entity) {

        ContactDto contactDto = new ContactDto();
        contactDto.setPhone(entity.getPhone());
        contactDto.setSecondPhone(entity.getSecondPhone());
        contactDto.setEmail(entity.getEmail());
        return  contactDto;
    }

    @Override
    public List<ContactDto> from(List<ContactEntity> entities) {

        return entities.stream().map(entity -> from(entity)).collect(Collectors.toList());
    }
}
