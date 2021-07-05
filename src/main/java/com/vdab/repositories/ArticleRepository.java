package com.vdab.repositories;

import com.vdab.domain.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ArticleRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Article> getAllArticles() {
        List<Article>articles =entityManager.createQuery("select g from Game g",Article.class).getResultList();
        articles.addAll(entityManager.createQuery("select l from Lp l",Article.class).getResultList());
        articles.addAll(entityManager.createQuery("select b from Book b",Article.class).getResultList());
        return articles;

    }
}
