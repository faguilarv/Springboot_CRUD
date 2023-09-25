package com.faguilar.mycrud.domain;

import lombok.Data;

@Data
public class Client {

   private long id;

   private String nombre;
   private String apellido;
   private String email;
   private String telefono;


}
