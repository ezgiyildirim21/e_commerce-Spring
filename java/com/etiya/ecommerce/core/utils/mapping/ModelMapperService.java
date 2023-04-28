package com.etiya.ecommerce.core.utils.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forResponse();
    ModelMapper forRequest();
}
