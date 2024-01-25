package org.cem.Spring_AI_24012024.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.cem.Spring_AI_24012024.entity.Product;
import org.cem.Spring_AI_24012024.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/save")
    public Product save(Product product){
        return productService.save(product);
    }
    @GetMapping("/find-all")
    public List<Product> findAll(){
        return productService.findAll();
    }
    @PostMapping("/find-by-id")
    public Optional<Product> findById(Long id){
        return productService.findById(id);
    }
    @GetMapping("/update")
    public Product update(Product product)
    {return productService.update(product);}

    @GetMapping("/find-by-product-name")
    public Optional<Product> findByProductName(String productName){
        return productService.findByProductName(productName);
    }

    @GetMapping("/find-by-price-range")
    public List<Product> findByPriceRange(Double minPrice, Double maxPrice){
        return productService.findProductByProductPriceBetween(minPrice, maxPrice);
    }

    @GetMapping("/find-by-product-name-contains")
    public List<Product> findByProductNameContains(String productName) {
        return productService.findProductsByProductNameContains(productName);
    }

    /**
     * ODEV
     */

    @GetMapping("/find-by-products-price-greater-than")
    public List<Product> findByProductCategory(Double price){
        return productService.findProductsByProductPriceGreaterThan(price);
    }

    @GetMapping("/find-by-product-unit-in-stock")
    public List<Product> findByProductUnitInStock(Integer productUnitInStock){
        return productService.findProductByProductUnitInStockGreaterThan(productUnitInStock);
    }

    @GetMapping("/find-by-product-price-is-greater-than-equal")
    public List<Product> findByProductPriceIsGreaterThanEqual(Double productPrice){
        return productService.findProductByProductPriceIsGreaterThanEqual(productPrice);
    }

    @GetMapping("/find-products-by-product-category")
    public List<Product> findByProductsByProductCategory(String productCategory){
        return productService.findProductsByProductCategory(productCategory);
    }

    @GetMapping("exists-by-product-category")
    public Boolean existsByProductCategory(String productCategory){
        return productService.existsByProductCategory(productCategory);
    }

    @GetMapping("find-products-by-product-category-is-null")
    public List<Product> findProductsByProductCategoryIsNull(){
        return productService.findProductsByProductCategoryIsNull();
    }

    @GetMapping("find-products-by-product-category-starts-with")
    public List<Product> findProductsByProductCategoryStartsWith(String productCategory){
        return productService.findProductsByProductCategoryStartsWith(productCategory);
    }





}
