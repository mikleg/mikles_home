package Mikles.homepage.mikle.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Article {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 45)
    private String title;

    @NotNull
    private LocalDateTime dateOfCreation;

    private String text;

}