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


//    public List<Article> getAllArticles() {
//        TypedQuery<Article>articles =entityManager.createQuery("select a from Article")
//    }
}
