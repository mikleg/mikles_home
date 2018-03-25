package Mikles.homepage.mikle.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Article {


    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Size(min = 3, max = 45)
    private String title;

    @NotNull
    private LocalDateTime dateOfCreation;

    @Lob
    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String text;

    @ManyToMany (mappedBy = "articles")
    private List<Page> pages;


    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Article() {

    }

    public Article(@NotNull @Size(min = 3, max = 45) String title, String text) {
        this.title = title;
        this.text = text;
        this.dateOfCreation = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }
}