package Mikles.homepage.mikle.Data;

import Mikles.homepage.mikle.Models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PagesDAO extends CrudRepository<Page, Integer> {
//    @Query(value="SELECT * FROM articles WHERE id =:foobar`", nativeQuery = true)
//public ArrayList<Article> get(@Param(value="foobar") int someId);
}