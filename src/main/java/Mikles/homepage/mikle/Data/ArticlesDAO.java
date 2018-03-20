package Mikles.homepage.mikle.Data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import Mikles.homepage.mikle.Models.*;

@Repository
@Transactional
public interface ArticlesDAO extends CrudRepository<Article, Integer> {
}