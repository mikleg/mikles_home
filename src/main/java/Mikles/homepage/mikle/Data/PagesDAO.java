package Mikles.homepage.mikle.Data;

import Mikles.homepage.mikle.Models.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PagesDAO extends CrudRepository<Page, Integer> {
    @Query(value="SELECT * FROM pages WHERE title=:foobar LIMIT 1", nativeQuery = true)
    public Page getPageByName(@Param(value="foobar") String name);
}