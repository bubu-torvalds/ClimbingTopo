package mb.app.climbingTopo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Maxime
 *
 */
@Entity
public class Climber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;

	private String lastName;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Route> doneRouteList;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Route> projectList;

	public long getClimberId() {
		return id;
	}

	public void setClimberId(long climberId) {
		this.id = climberId;
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

	public List<Route> getDoneRouteList() {
		return doneRouteList;
	}

	public void setDoneRouteList(List<Route> doneRouteList) {
		this.doneRouteList = doneRouteList;
	}

	public List<Route> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Route> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "Climber [climberId=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
