package Mikles.homepage.mikle.Data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import Mikles.homepage.mikle.Models.*;

import java.util.ArrayList;

@Repository
@Transactional
public interface ArticlesDAO extends CrudRepository<Article, Integer> {
    @Query(value="SELECT * FROM articles WHERE title=:foobar LIMIT 1", nativeQuery = true)
    public Page getArticleByName(@Param(value="foobar") String name);
}