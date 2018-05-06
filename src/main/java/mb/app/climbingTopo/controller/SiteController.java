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

import mb.app.climbingTopo.entity.Site;
import mb.app.climbingTopo.services.SiteService;

/**
 * 
 * @author Maxime Buttard
 *
 */

@RestController
public class SiteController {

	@Autowired
	private SiteService siteService;
	
	@RequestMapping(value="/sites", method=RequestMethod.GET)
	public ResponseEntity<List<Site>> findAll() {
		List<Site> sites = siteService.findAll();
		
		return new ResponseEntity<List<Site>>(sites, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/sites/{id}", method=RequestMethod.GET)
	public ResponseEntity<Site> findOneById(@PathVariable String id) {
		
		Site site = siteService.findOneById(new Long(id));
		
		return new ResponseEntity<Site>(site, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/sites{name}", method=RequestMethod.GET)
	public ResponseEntity<Site> findOneByName(@PathVariable String name) {
		
		Site site = siteService.findOneByName(name);
		
		return new ResponseEntity<Site>(site, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/sites", method=RequestMethod.PUT)
	public ResponseEntity<Site> putSite(@RequestBody Site site) {
		
		Site siteCreated = this.siteService.createSite(site);
		
		return new ResponseEntity<Site>(siteCreated, HttpStatus.CREATED);
		
	}	
	
}
