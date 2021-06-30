package com.vdab.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Favorite {

    @OneToMany
    private Article article;

    @ManyToOne
    private User user;
}
