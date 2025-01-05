package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "discount_percentage")
    private double discountPercentage;

    @Column(name = "validity_start_date")
    private LocalDate validityStartDate;

    @Column(name = "minimum_order_value")
    private double minimumOrderValue;

    @Column(name = "active")
    private boolean isActive=true;

    @ManyToMany(mappedBy = "usedCoupons")
    private Set<User> users = new HashSet<>();
}
