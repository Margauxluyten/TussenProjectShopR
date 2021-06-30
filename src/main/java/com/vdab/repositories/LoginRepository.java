package com.vdab.repositories;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class LoginRepository {

    @PersistenceContext
    private EntityManager entityManager;
}
