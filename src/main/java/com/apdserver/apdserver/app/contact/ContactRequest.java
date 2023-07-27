package com.apdserver.apdserver.app.contact;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

//@Data
public class ContactRequest {

    @NotBlank(message = "Please enter valid phone number")
    private String phone;

    @NotBlank(message = "Please enter valid phone number")
    private String secondPhone;

    @Email(message = "Please enter valid email")
    private String email;

    public ContactRequest() {

    }

    public ContactRequest(String phone, String secondPhone, String email) {
        this.phone = phone;
        this.secondPhone = secondPhone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
