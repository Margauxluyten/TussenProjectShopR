package com.vdab.repositories;

import com.vdab.domain.OrderArticle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class OrderRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(rollbackOn = Exception.class)
    public void buyArticle(OrderArticle newBoughtArticle) {
        entityManager.merge(newBoughtArticle);
    }

    public List<OrderArticle> getOrderedArticles() {
        TypedQuery<OrderArticle> orderedArticles = entityManager.createQuery("select oa from OrderArticle oa",OrderArticle.class);
        return orderedArticles.getResultList();
    }

    public OrderArticle findOrderArticleById(long id) {
        return entityManager.find(OrderArticle.class,id);
    }

    @Transactional
    public void deleteItem(long id) {
        OrderArticle orderArticle = findOrderArticleById(id);
        entityManager.remove(orderArticle);
    }
    @Transactional(rollbackOn = Exception.class)
    public void updateShoppingItem(OrderArticle orderArticle) {
        entityManager.merge(orderArticle);
    }
}
