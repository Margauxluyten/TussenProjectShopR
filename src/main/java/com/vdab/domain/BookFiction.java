package com.vdab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type")
@DiscriminatorValue("Fiction")
public class BookFiction extends Book {

    @Enumerated(EnumType.STRING)
    private BookGenre bookGenre;
    @Column(length = 255)
    private String description;
}
