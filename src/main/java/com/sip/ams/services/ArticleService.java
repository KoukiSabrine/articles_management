package com.sip.ams.services;

import com.sip.ams.entities.Article;
import com.sip.ams.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article getOneArticleById(long idArticle)
    {
        return articleRepository.findById(idArticle).orElseThrow(() -> new IllegalArgumentException("ArticleId " + idArticle + " not found"));
    }
}
