package com.vdab.repositories;

import com.vdab.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getUsers() {
        TypedQuery<User> users = entityManager.createQuery("select u from User u", User.class); return users.getResultList(); }

    public User checkPassword(User user){
        return entityManager.createQuery("select u from User u where u.password = :password", User.class)
                .setParameter("password", user.getPassword())
                .getSingleResult();
    }

    @Transactional(rollbackOn = Exception.class)
    public void saveUser(User newUser) {
        entityManager.persist(newUser);
    }
}
