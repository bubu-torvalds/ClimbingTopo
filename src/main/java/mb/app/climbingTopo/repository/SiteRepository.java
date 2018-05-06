package mb.app.climbingTopo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import mb.app.climbingTopo.entity.Site;

/**
 * 
 * @author Maxime Buttard
 *
 */
public interface SiteRepository extends JpaRepository<Site, Long> {
	
	List<Site> findAll();
	
	Site findOneById(@Param("id") long id);
	
	Site findOneByName(@Param("name") String name);

}
