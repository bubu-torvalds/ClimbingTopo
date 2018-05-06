package mb.app.climbingTopo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Maxime
 *
 */
@Entity
public class Grade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String grade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCotationId() {
		return id;
	}

	public void setCotationId(long cotationId) {
		this.id = cotationId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Cotation [cotationId=" + id + ", grade=" + grade + "]";
	}
	
}
