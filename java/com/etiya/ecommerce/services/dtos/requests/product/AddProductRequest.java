package com.etiya.ecommerce.services.dtos.requests.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {

    @NotBlank(message = "Price alanı boş bırakılamaz.")
    @Size(min = 5, message = "Price alanı 2 karakterden kısa olamaz.")
    private String price;

    @NotBlank(message = "Details alanı boş bırakılamaz.")
    @Size(min = 20, message = "Status code alanı 20 karakterden kısa olamaz.")
    private String details;

    @NotBlank(message = "Name alanı boş bırakılamaz.")
    @Size(min = 6, message = "name alanı 6 karakterden kısa olamaz.")
    private String name;
}
