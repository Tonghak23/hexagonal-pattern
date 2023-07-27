package com.apdserver.apdserver.app.contact;

import com.apdserver.apdserver.core.contact.ContactDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactMapperImplement implements ContactMapper {
    @Override
    public ContactRespone from(ContactDto dto) {

        ContactRespone respone = new ContactRespone();
        respone.getId(dto.getId());
        respone.setPhone(dto.getPhone());
        respone.setSecondPhone(dto.getSecondPhone());
        respone.setEmail(dto.getEmail());
        return respone;
    }

    @Override
    public ContactDto from(ContactRequest request) {

        ContactDto contactDto = new ContactDto();
        contactDto.setPhone(request.getPhone());
        contactDto.setSecondPhone(request.getSecondPhone());
        contactDto.setEmail(request.getEmail());
        return contactDto;
    }

    @Override
    public List<ContactRespone> from(List<ContactDto> dtos) {
        List<ContactRespone> response = dtos.stream().map(dto -> from(dto)).collect(Collectors.toList());
        return response;
    }

}
