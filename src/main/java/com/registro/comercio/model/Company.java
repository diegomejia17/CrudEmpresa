package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@Data
@Entity
@Table(name = "company")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Company {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column (length = 50, name = "name", nullable = false)
    @EqualsAndHashCode.Include
    private String name;
    @Column(length = 10, name = "foundation_date", nullable = false)
    private Date foundationDate;
    @Column(length = 50, name = "address", nullable = false)
    private String address;
    @Column( name = "nit", nullable = false ,length = 20)
    private String nit;


}
