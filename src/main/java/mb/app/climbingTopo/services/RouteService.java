package mb.app.climbingTopo.services;

import java.util.List;

import mb.app.climbingTopo.entity.Route;

/**
 * 
 * @author Maxime Buttard
 *
 */
public interface RouteService {
	
	public List<Route> findAll();
	
	public Route findOneById(long id);
	
	public Route createRoute(Route route);
	

}
