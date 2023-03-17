/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcpojectconfiguration.DAO;

import com.mycompany.mvcpojectconfiguration.Models.article;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/**
 *
 * @author dell
 */
public class ArticleImp implements ArticleInsterface{
    JdbcTemplate template;
    String sql;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    @Override
    public void addArticle(article a) {
           sql="insert into article(designation,prix,qte) values('"+a.getDesignation()+"','"+a.getPrix()+"','"+
                a.getQte()+"');";
            template.update(sql);
    }

    @Override
    public void deleteArticle(int code) {
        sql="delete from article where id="+code;
        template.update(sql);
    }

    @Override
    public void updateArticle(article a) {
        sql="update article set designation='"+a.getDesignation()+"',prix='"+a.getPrix()+
                "',qte='"+a.getQte()+"' where id='"+a.getId()+"';";
                template.update(sql);

    }
    
    @Override

public article getArticleById(int code){
        String sql="select * from article where id=?";
        return template.queryForObject(sql, new Object[]{code},new BeanPropertyRowMapper<article>(article.class));
}

    @Override

    public List<article> getAllArticle(){
        return template.query("select * from article",new RowMapper<article>(){
            public article mapRow(ResultSet rs, int row) throws SQLException {
                article prd=new article();
                prd.setId(rs.getInt(1));
                prd.setDesignation(rs.getString(2));
                prd.setPrix(rs.getFloat(3));
                prd.setQte(rs.getInt(4));
                return prd;
            }
        });
    }
    public SqlRowSet getStringe(){
      SqlRowSet hello= template.queryForRowSet("select designation from article where id=552");
      return hello;

    }
    
}
