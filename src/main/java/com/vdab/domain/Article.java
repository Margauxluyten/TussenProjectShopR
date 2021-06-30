package com.vdab.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(updatable = false,insertable = false)
//    private String type;
    @Column(length = 100, nullable = false )
    private String title;
    @Column(scale = 2, nullable = false )
    private Double price;
    @Column(length = 100, nullable = false )
    private String supplierId;

//    @OneToMany
//    private List<Review>reviews;

}
