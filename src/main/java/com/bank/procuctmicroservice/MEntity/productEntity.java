package com.bank.procuctmicroservice.MEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
@Getter
@Setter
@NoArgsConstructor
public class productEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
}
