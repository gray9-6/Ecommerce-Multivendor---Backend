package com.example.model;

import com.example.enums.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "mob_no",length = 10,unique = true)
    private String mobileNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private USER_ROLE role = USER_ROLE.CUSTOMER;

    @OneToMany
//    @JoinColumn
    private Set<Address> addresses = new HashSet<>();

    @ManyToMany
    @JsonIgnore
    private Set<Coupon> usedCoupons = new HashSet<>();
}
