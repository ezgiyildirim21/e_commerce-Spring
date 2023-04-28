package com.etiya.ecommerce;

import com.etiya.ecommerce.core.exception.ServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestControllerAdvice
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}


	@Bean
	public ModelMapper forResponse() { return new ModelMapper();}



	@ExceptionHandler({ServiceException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleBusinessException(ServiceException exception)
	{
		return "Hata ile karşılaşıldı";
	}


	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleValidationException(MethodArgumentNotValidException exception)
	{
		Map<String, String> errors = new HashMap<>();

		for(FieldError fieldError : exception.getBindingResult().getFieldErrors()){
			errors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}

		return "Validasyon hatası var. Kontrol ediniz.";
	}

}
