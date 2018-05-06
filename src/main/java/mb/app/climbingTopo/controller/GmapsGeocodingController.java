package mb.app.climbingTopo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

import mb.app.climbingTopo.services.GmapsGeocodingService;

/**
 * 
 * @author Maxime Buttard
 *
 */
@RestController
public class GmapsGeocodingController {

	@Autowired
	private GmapsGeocodingService gmapsGeocodingService;
	
	@RequestMapping(value="/geocoding/{city}", method=RequestMethod.GET)
	public ResponseEntity<List<GeocodingResult>> findByCity(@PathVariable String city) {
		List<GeocodingResult> results = new ArrayList<>();
		try {
			results = gmapsGeocodingService.findByCity(city);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<List<GeocodingResult>>(results, HttpStatus.FOUND);
	}
}
