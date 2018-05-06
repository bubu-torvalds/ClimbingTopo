package mb.app.climbingTopo.dto;

import java.util.List;

/**
 * 
 * @author Maxime
 *
 */
public class ClimberDto {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private List<RouteDto> doneRouteList;
	
	private List<RouteDto> projectList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<RouteDto> getDoneRouteList() {
		return doneRouteList;
	}

	public void setDoneRouteList(List<RouteDto> doneRouteList) {
		this.doneRouteList = doneRouteList;
	}

	public List<RouteDto> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<RouteDto> projectList) {
		this.projectList = projectList;
	}
	
	
}


