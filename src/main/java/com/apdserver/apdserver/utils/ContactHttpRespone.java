package com.apdserver.apdserver.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ContactHttpRespone<T> {
     String message;
     String status;
     T data;

     public ContactHttpRespone() {

     }

     public ContactHttpRespone(String message, String status, T data) {
          this.message = message;
          this.status = status;
          this.data = data;
     }
}
