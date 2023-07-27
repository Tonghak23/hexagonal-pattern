package com.apdserver.apdserver.infra.contact;

import jakarta.persistence.*;
import lombok.Data;

//@Data
@Entity
@Table(name = "contact")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "phone")
    private String phone;

    @Column(name = "secondPhone")
    private String secondPhone;

    @Column(name = "email")
    private String email;

    @Column(name= "isDeleted")
    private Boolean isDeleted = false;

    public ContactEntity() {

    }

    public ContactEntity(Integer id, String phone, String secondPhone, String email, Boolean isDeleted) {
        this.id = id;
        this.phone = phone;
        this.secondPhone = secondPhone;
        this.email = email;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
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

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
