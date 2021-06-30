package com.vdab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("Lp")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"title","artist"}))
public class Lp extends Article {


    @Column(length = 100)
    public String artist;
    @Enumerated(EnumType.STRING)
    private LpGenre lpGenre;

//    public String getType() {
//        return "Lp";
//    }
}
