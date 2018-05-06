package mb.app.climbingTopo.dto;

/**
 * 
 * @author Maxime
 *
 */
public class SiteDto {

	private long siteId;
	
	private String name;
	
	public long getId() {
		return siteId;
	}

	public void setId(long id) {
		this.siteId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
