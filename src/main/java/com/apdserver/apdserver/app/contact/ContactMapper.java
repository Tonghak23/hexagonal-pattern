package com.apdserver.apdserver.app.contact;

import com.apdserver.apdserver.core.contact.ContactDto;

import java.util.List;

public interface ContactMapper {

    List<ContactRespone> from(List<ContactDto> dtos);
    ContactRespone from(ContactDto dto);
    ContactDto from(ContactRequest request);
}
