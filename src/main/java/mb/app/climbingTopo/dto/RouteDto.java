package mb.app.climbingTopo.dto;

/**
 * 
 * @author Maxime
 *
 */
public class RouteDto {
	
	private long routeId;
	
	private String name;
	
	private String cotation;

	public long getId() {
		return routeId;
	}

	public void setId(long id) {
		this.routeId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCotation() {
		return cotation;
	}

	public void setCotation(String cotation) {
		this.cotation = cotation;
	}

}
