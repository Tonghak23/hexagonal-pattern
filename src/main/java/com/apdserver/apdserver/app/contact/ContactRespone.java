package com.apdserver.apdserver.app.contact;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ContactRespone {
    private Integer id;
    private String phone;
    private String secondPhone;
    private String email;

    public ContactRespone() {

    }

    public ContactRespone(Integer id, String phone, String secondPhone, String email) {
        this.id = id;
        this.phone = phone;
        this.secondPhone = secondPhone;
        this.email = email;
    }

    public Integer getId(Integer id) {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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
