package mb.app.climbingTopo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import mb.app.climbingTopo.entity.Route;

/**
 * @author Maxime Buttard
 */

public interface RouteRepository extends JpaRepository<Route, Long> {
	
	List<Route> findAll();
	
	Route findOneById(@Param("id") long id);

}
