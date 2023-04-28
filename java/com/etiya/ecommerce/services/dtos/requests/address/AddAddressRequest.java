package com.etiya.ecommerce.services.dtos.requests.address;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddAddressRequest {


    @NotNull(message = "address alanı boş olamaz")
    @NotBlank(message = "address alanı boş olamaz")
    @Size(min = 10,message = "adresiniz 10 karakterden küçük olamaz")
    private String address;

    @NotNull(message = "city alanı boş olamaz")
    @NotBlank(message = "city alanı boş olamaz")
    @Size(min = 3,message = "city 3 karakterden küçük olamaz")
    private String city;

    @NotNull(message = "postcode alanı boş olamaz")
    private int postcode;

    @NotNull(message = "country alanı boş olamaz")
    @NotBlank(message = "country alanı boş olamaz")
    @Size(min = 2,message = "country 2 karakterden küçük olamaz")
    private String country;

    @NotNull(message = "country code alanı boş olamaz")
    @NotBlank(message = "country code alanı boş olamaz")
    @Size(min = 2,message = "country code 2 karakterden küçük olamaz")
    private String countryCode;

    @NotNull(message = "details alanı boş olamaz")
    @NotBlank(message = "details alanı boş olamaz")
    private String details;
}
