package mb.app.climbingTopo.services.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

import mb.app.climbingTopo.services.GmapsGeocodingService;

/**
 * 
 * @author Maxime Buttard
 *
 */
@Service
public class GmapsGeocodingServiceImpl implements GmapsGeocodingService {

	@Override
	public List<GeocodingResult> findByCity(String city) throws ApiException, InterruptedException, IOException {
		GeoApiContext context = new GeoApiContext.Builder()
				.apiKey("AIzaSyCJRKpATWFG7-gPVykjNWo8HfNuE-pRNH4")
				.build();
		GeocodingResult[] results = GeocodingApi.geocode(context, 
				city).await();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(results[0].addressComponents));
		return Arrays.asList(results);
	}

}
