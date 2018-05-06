package mb.app.climbingTopo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mb.app.climbingTopo.entity.Site;
import mb.app.climbingTopo.repository.SiteRepository;
import mb.app.climbingTopo.services.SiteService;

/**
 * 
 * @author Maxime Buttard
 *
 */
@Service
public class SiteServiceImpl implements SiteService {
	
	@Autowired
	private SiteRepository siteRepository;

	@Override
	public List<Site> findAll() {
		return siteRepository.findAll();
	}

	@Override
	public Site findOneById(long id) {
		return siteRepository.findOneById(id);
	}

	@Override
	public Site findOneByName(String name) {
		return siteRepository.findOneByName(name);
	}

	@Override
	public Site createSite(Site site) {
		return siteRepository.save(site);
	}

}
