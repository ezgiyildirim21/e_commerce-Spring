package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerce.core.utils.result.DataResult;
import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.repositories.abstracts.IProductDao;
import com.etiya.ecommerce.services.abstracts.ProductService;
import com.etiya.ecommerce.services.dtos.requests.product.AddProductRequest;
import com.etiya.ecommerce.services.dtos.responses.customer.AddCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.customer.GetByIdCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.product.AddProductResponse;
import com.etiya.ecommerce.services.dtos.responses.product.GetByIdProductResponse;
import com.etiya.ecommerce.services.dtos.responses.product.ListProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private IProductDao productDao;
    private ModelMapperService mapperService;

    @Override
    public GetByIdProductResponse getById(Integer id) {
        Optional<Product> productOptional = productDao.findById(id);
        if (productOptional.isEmpty()) {
            throw new RuntimeException("Aranılan id değerde product bulunamadı");
        }
        Product productToId = productOptional.get();
        GetByIdProductResponse response = mapperService.forResponse().map(productToId, GetByIdProductResponse.class);
        return response;
    }

    @Override
    public DataResult<AddProductResponse> add(AddProductRequest addProductRequest) {
        Product product1=new Product();
        product1=mapperService.forRequest().map(addProductRequest,Product.class);
        productDao.save(product1);
        AddProductResponse addProductResponse= mapperService.forResponse().map(product1, AddProductResponse.class);
        return new DataResult<AddProductResponse>(addProductResponse,true,"Ürün Eklendi");
    }

  /*  @Override
    public List<ListProductResponse> getAll() {
        return productDao.getAll();
    }

   */
}
