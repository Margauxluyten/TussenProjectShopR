package com.vdab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.lang.reflect.Type;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Game")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"title","publisher"}))
public class Game extends Article{
    @Column(length = 100)
    private String publisher;
    private int minimumAge;
    @Enumerated(EnumType.STRING)
    private GameGenre gameGenre;
//    private String type = "Game";

}
