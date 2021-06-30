package com.vdab.repositories;

import com.vdab.domain.Lp;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class LpRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Lp> getLps() {
        TypedQuery<Lp> lps = entityManager.createQuery("select l from Lp l",Lp.class);
        return lps.getResultList();
    }

    @Transactional(rollbackOn = Exception.class)
    public void saveLp(Lp newLp) {
        entityManager.persist(newLp);
    }

    public Lp findLpById(long id) {
        return entityManager.find(Lp.class, id);
    }
    @Transactional
    public void updateLp(Lp lp) {
        entityManager.merge(lp);
    }
    @Transactional
    public void deleteLp(long id) {
        Lp lp = findLpById(id);
        entityManager.remove(lp);
    }
}
