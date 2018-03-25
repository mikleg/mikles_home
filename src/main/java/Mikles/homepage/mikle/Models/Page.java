package Mikles.homepage.mikle.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Page {


    @Id
    @GeneratedValue
    private Integer id;


    @Size(min = 0, max = 65)
    private String title;

    @ManyToMany(cascade=CascadeType.ALL)
    private List<Article> articles;

    public Page() {
    }

    public Page(@Size(min = 0, max = 65) String title, List<Article> articles) {
        this.title = title;
        this.articles = articles;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}