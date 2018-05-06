package mb.app.climbingTopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mb.app.climbingTopo.entity.Route;
import mb.app.climbingTopo.services.RouteService;

/**
 * @author Maxime Buttard
 */
@RestController
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	@RequestMapping(value="/routes", method=RequestMethod.GET)
	public ResponseEntity<List<Route>> findAll() {
		List<Route> routes = routeService.findAll();
		
		return new ResponseEntity<List<Route>>(routes, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/routes/{id}", method=RequestMethod.GET)
	public ResponseEntity<Route> findOneById(@PathVariable String id) {
		Route route = routeService.findOneById(new Long(id));
		
		return new ResponseEntity<Route>(route, HttpStatus.FOUND);
		
	}
	
	@RequestMapping(value="/routes", method=RequestMethod.PUT)
	public ResponseEntity<Route> putRoute(@RequestBody Route route) {
		
		Route routeCreated = this.routeService.createRoute(route);
		
		return new ResponseEntity<Route>(routeCreated, HttpStatus.CREATED);
		
	}

}
