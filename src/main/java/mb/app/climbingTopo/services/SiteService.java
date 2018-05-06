package mb.app.climbingTopo.services;

import java.util.List;

import mb.app.climbingTopo.entity.Site;

/**
 * 
 * @author Maxime Buttard
 *
 */
public interface SiteService {
	
	public List<Site> findAll();
	
	public Site findOneById(long id);
	
	public Site findOneByName(String name);
	
	public Site createSite(Site site);

}
