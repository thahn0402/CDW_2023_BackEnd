package nlu.cdw_2023_backend.service;

import nlu.cdw_2023_backend.dao.ProductDao;
import nlu.cdw_2023_backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product addNewProduct(Product product) {
        return productDao.save(product);
    }
}
