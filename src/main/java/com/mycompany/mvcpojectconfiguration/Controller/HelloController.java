/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcpojectconfiguration.Controller;

/**
 *
 * @author dell
 */
import com.mycompany.mvcpojectconfiguration.DAO.ArticleImp;
import com.mycompany.mvcpojectconfiguration.Models.article;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HelloController {
    @Autowired
     ArticleImp imp=new ArticleImp();
    @GetMapping("/")  
    public String display(Model model)  
    {  
        List<article> ar=new ArrayList<>();
        ar=imp.getAllArticle();
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i).getDesignation());
        }
        model.addAttribute("articles", ar);
       
//        imp.updateArticle(new article(545,"pes 2023",600,134));
//        imp.deleteArticle(544);
        //imp.addArticle(new article(1,"hello",14,12));
//        article a=imp.getArticleById(545);
//        System.out.println(a.getDesignation());
//System.out.println(imp.getStringe());
//System.out.println("hiiiiiiiiiiiii");

        
        return "Hello";  
    }    
    @GetMapping("/Ayoub/{someID}")  
    public String displaye(@RequestParam("nom") String nom,Model model,@PathVariable("someID") String someID)  
    {            
        model.addAttribute("user", nom);
              

         
        return "How";  
    } 
    
     @GetMapping("/produit/create")  
    public String create()  
    {            
        return "createProduit";  
    } 
    @PostMapping("/produit/store")  
    public String store(@RequestParam("designation") String designation,@RequestParam("prix") float prix,
            @RequestParam("qte") int qte)  
    {            
        System.out.println(designation);
        article a=new article(1,designation,prix,qte);
        imp.addArticle(a);
        return "redirect:/";  
    } 
    @GetMapping("/produit/destroy/{id}")  
    public String destroy(@PathVariable("id") int id)  
    {            
       imp.deleteArticle(id);
        return "redirect:/";  
    } 
    
     @GetMapping("/produit/edit/{id}")  
    public String edit(@PathVariable("id") int id,Model model)  
    {            
        article ar=imp.getArticleById(id);
        model.addAttribute("articleFinded",ar);
        return "editProduit";  
    } 
    @PostMapping("/produit/update/{id}")  
    public String update(@PathVariable("id") int id,Model model,@RequestParam("designation") String designation,@RequestParam("prix") float prix,
            @RequestParam("qte") int qte)  
    {            
        imp.updateArticle(new article(id,designation,prix,qte));
        return "redirect:/";   
    } 
    
    
    
}
