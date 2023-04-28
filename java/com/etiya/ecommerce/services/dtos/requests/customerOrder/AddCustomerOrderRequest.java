package com.etiya.ecommerce.services.dtos.requests.customerOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.validation.constraints.*;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerOrderRequest {

    @NotBlank(message = "Status code alanı boş bırakılamaz.")
    @Size(min = 5, message = "Status code alanı 5 karakterden kısa olamaz.")
    private String statusCode;

    private String placed;

    private String paid;

    @NotBlank(message = "Price alanı boş bırakılamaz.")
    @Size(min = 2, message = "Price alanı 2 karakterden kısa olamaz.")
    private String price;

    private String details;

    private int customerId;

}
