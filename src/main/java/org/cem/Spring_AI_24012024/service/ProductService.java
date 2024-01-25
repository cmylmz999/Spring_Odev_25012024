package org.cem.Spring_AI_24012024.service;

import lombok.RequiredArgsConstructor;
import org.cem.Spring_AI_24012024.entity.Product;
import org.cem.Spring_AI_24012024.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IService<Product,Long> {
    private final ProductRepository productRepository;


    @Override
    public Product save(Product product) {
       return productRepository.save(Product.builder()
                       .productName(product.getProductName())
                       .productCategory(product.getProductCategory())
                       .productPrice(product.getProductPrice())
                       .productDescription(product.getProductDescription())
                       .productUnitInStock(product.getProductUnitInStock())
               .build());
    }

    @Override
    public Product update(Product product) {
        Optional<Product> product1 = productRepository.findById(product.getId());
        if(product1.isEmpty()){
         return null;
        }
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveAll(Iterable<Product> t) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);

    }
    public Optional<Product> findByProductName(String productName){
        return productRepository.findByProductName(productName);
    }

    public List<Product> findProductByProductPriceBetween(Double minPrice, Double maxPrice){
        return productRepository.findProductsByProductPriceBetween(minPrice, maxPrice);
    }
    public List<Product> findProductsByProductNameContains(String productName){
        return productRepository.findProductsByProductNameContains(productName);
    }

    /**
     *
     * ODEV
     */

    public List<Product> findProductsByProductPriceGreaterThan(Double price){
        return productRepository.findProductsByProductPriceGreaterThan(price);
    }

    public List<Product> findProductByProductUnitInStockGreaterThan(Integer productUnitInStock){
        return productRepository.findProductByProductUnitInStockGreaterThan(productUnitInStock);
    }

    public List<Product> findProductByProductPriceIsGreaterThanEqual(Double productPrice){
        return productRepository.findProductByProductPriceIsGreaterThanEqual(productPrice);
    }

    public List<Product> findProductsByProductCategory(String productCategory){
        return productRepository.findProductsByProductCategory(productCategory);
    }

    public Boolean existsByProductCategory(String productCategory){
        return productRepository.existsByProductCategory(productCategory);
    }

    public List<Product> findProductsByProductCategoryIsNull(){
        return productRepository.findProductsByProductCategoryIsNull();
    }

    public List<Product> findProductsByProductCategoryStartsWith(String productCategory){
        return productRepository.findProductsByProductCategoryStartsWith(productCategory);
    }
}
