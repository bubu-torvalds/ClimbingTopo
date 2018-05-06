package mb.app.climbingTopo.services;

import java.io.IOException;
import java.util.List;

import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

/**
 * 
 * @author Maxime Buttard
 *
 */
public interface GmapsGeocodingService {

	public List<GeocodingResult> findByCity(String city) throws ApiException, InterruptedException, IOException;
}
