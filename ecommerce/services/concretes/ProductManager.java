package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.repositories.abstracts.IProductDao;
import com.etiya.ecommerce.services.abstracts.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private IProductDao productDao;


    @Override
    public Product getById(Integer id) {
        Optional<Product> productOptional = productDao.findById(id);
        if (productOptional.isPresent()) {
            Product productToId = productOptional.get();
            return productToId;
        }
        return null;
    }

    @Override
    public Product add(Product product) {
        if (product.getName().isEmpty() || product.getPrice() == 0 || product.getDetails().isEmpty()) {
            return null;
        }
        return productDao.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
