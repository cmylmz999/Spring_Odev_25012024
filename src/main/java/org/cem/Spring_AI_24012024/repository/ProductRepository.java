package org.cem.Spring_AI_24012024.repository;

import org.cem.Spring_AI_24012024.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByProductName(String productName);
    List<Product> findProductsByProductPriceBetween(Double minPrice, Double maxPrice);
    List<Product> findProductsByProductNameContains(String productName);


    /**
     * ODEV
     */

    List<Product> findProductsByProductPriceGreaterThan(Double price);
    List<Product> findProductByProductUnitInStockGreaterThan(Integer productUnitInStock);
    List<Product> findProductByProductPriceIsGreaterThanEqual(Double productPrice);
    List<Product> findProductsByProductCategory(String productCategory);
    Boolean existsByProductCategory(String productCategory);
    List<Product> findProductsByProductCategoryIsNull();
    List<Product> findProductsByProductCategoryStartsWith(String productCategory);

}
