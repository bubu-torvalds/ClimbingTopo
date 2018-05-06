package mb.app.climbingTopo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import mb.app.climbingTopo.dto.RouteDto;
import mb.app.climbingTopo.entity.Route;

/**
 * 
 * @author Maxime
 *
 */
@Mapper
public interface RouteMapper {
	
	public RouteDto mapRouteToDto(Route route);
	
	public List<RouteDto> mapRouteLisToDto (List<Route> routeList);

}
