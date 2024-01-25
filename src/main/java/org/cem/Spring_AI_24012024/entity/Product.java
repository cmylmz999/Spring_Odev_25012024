package org.cem.Spring_AI_24012024.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    private String productName;
    private String productCategory;
    private Double productPrice;
    private Integer productUnitInStock;
    private String productDescription;

}
