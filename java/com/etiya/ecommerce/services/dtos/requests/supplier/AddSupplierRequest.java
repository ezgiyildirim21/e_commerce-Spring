package com.etiya.ecommerce.services.dtos.requests.supplier;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSupplierRequest {

   @NotBlank(message = "Name alanı boş bırakılamaz")
   @Size(min = 5,message ="Name alanı 5 karakter içermelidir" )
   private String name;

   @NotBlank(message = "Surname alanı boş bırakılamaz")
   @Size(min = 5,message ="Surname alanı 5 karakter içermelidir" )
   private String surname;

   @NotBlank(message = "Details alanı boş bırakılamaz")
   @Size(min = 5,message ="Details alanı 5 karakter içermelidir" )
   private String details;

}
