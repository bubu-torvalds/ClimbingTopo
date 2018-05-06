package mb.app.climbingTopo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mb.app.climbingTopo.entity.Route;
import mb.app.climbingTopo.repository.RouteRepository;
import mb.app.climbingTopo.services.RouteService;

/**
 * 
 * @author Maxime Buttard
 *
 */
@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public List<Route> findAll() {
		return routeRepository.findAll();
	}

	@Override
	public Route findOneById(long id) {
		return routeRepository.findOneById(id);
	}

	@Override
	public Route createRoute(Route route) {
		return routeRepository.save(route);
	}

}
