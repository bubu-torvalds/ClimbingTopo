package mb.app.climbingTopo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import mb.app.climbingTopo.dto.SiteDto;
import mb.app.climbingTopo.entity.Site;

/**
 * 
 * @author Maxime
 *
 */
@Mapper
public interface SiteMapper {
	
	public SiteDto mapSiteToDto(Site site);
	
	public List<SiteDto> mapListSiteToDto(List<Site> listSite);

}
