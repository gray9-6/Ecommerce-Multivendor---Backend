package com.example.model;

import com.example.enums.Size;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private Orders orders;

    @ManyToOne
    private Product product;

    @Enumerated(EnumType.STRING)
    private Size size;

    private  int quantity;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private Long userId;
}
