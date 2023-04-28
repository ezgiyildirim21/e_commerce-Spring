package com.etiya.ecommerce.services.dtos.requests.customer;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

    @NotBlank(message = "full name alanı boş bırakılamaz !")
    @NotNull(message = "full name alanı boş bırakılamaz !")
    @Size(min = 4,message = "full name alanı en az 4 karakter olmalı")
    private String fullName;


    @NotBlank(message = "Phone alanı boş bırakılamaz ")
    @NotNull(message = "Phone alanı boş bırakulamaz")
    @Size(min = 11,max = 11,message = " \"Telefon numaranız doğru değil\"")
    private String phone;

    @NotBlank(message = "Mail alanı boş bırakılamaz ")
    private String email;

    @NotBlank(message = "Details kısmı boş bırakılamaz")
    @NotNull(message = "Details kısmı boş bırakılamaz")
    private String details;

}
