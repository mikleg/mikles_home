package Mikles.homepage.mikle.Controllers;

import Mikles.homepage.mikle.Data.*;
import Mikles.homepage.mikle.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ArticlesDAO articlesDAO;
    @Autowired
    private PagesDAO pagesDAO;

        @RequestMapping(value = "")
        public String index(Model model) {

            model.addAttribute("title", "first title");

          // Article hpArticle = articlesDAO.findById(0).orElse(null); //A new one in spring

//            Article newArt = new Article("title " + num.toString(), "text" + num.toString());
//            articlesDAO.save(newArt);
            Page mainPage = pagesDAO.findById(4).orElse(null);
            List<Article> articles= mainPage.getArticles();

            model.addAttribute("articles", articles);

            //model.addAttribute("p", hpArticle);
            return "index";
        }

    @RequestMapping(value = "about")
    public String about(Model model) {

        model.addAttribute("title", "first title");

        //Article hpArticle = articlesDAO.findById(0).orElse(null); //A new one in spring
//            Article mainArticle = articlesDAO.findById(1).orElse(null);
//            ArrayList<Article> al = new ArrayList<>();
//            al.add(mainArticle);
//            Page newPage = new Page("", al);
//            pagesDAO.save(newPage);
        Page mainPage = pagesDAO.findById(4).orElse(null);
        List<Article> articles= mainPage.getArticles();

        model.addAttribute("articles", articles);
        return "about";
    }

    @RequestMapping(value = "about")
    public String projects(Model model) {

        model.addAttribute("title", "first title");

        Page mainPage = pagesDAO.findById(4).orElse(null);
        List<Article> articles= mainPage.getArticles();

        model.addAttribute("articles", articles);
        return "projects";
    }

    public String contacts(Model model) {

        model.addAttribute("title", "first title");

        Page mainPage = pagesDAO.findById(4).orElse(null);
        List<Article> articles= mainPage.getArticles();

        model.addAttribute("articles", articles);
        return "contacts";
    }


}
