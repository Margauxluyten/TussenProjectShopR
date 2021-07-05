package com.vdab.services;

import com.vdab.domain.Article;
import com.vdab.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.getAllArticles();
    }

//    public List<Article>  getAllArticles() {
//        return articleRepository.getAllArticles();
//    }
}
