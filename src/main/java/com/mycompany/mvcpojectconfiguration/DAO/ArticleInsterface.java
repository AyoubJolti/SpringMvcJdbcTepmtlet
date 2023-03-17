/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mvcpojectconfiguration.DAO;

import com.mycompany.mvcpojectconfiguration.Models.article;
import java.util.List;

/**
 *
 * @author dell
 */
public interface ArticleInsterface {
       public void addArticle(article a);
    public void deleteArticle(int code);
    public void updateArticle(article a);
    public article getArticleById(int code);
    public List<article> getAllArticle();

}
