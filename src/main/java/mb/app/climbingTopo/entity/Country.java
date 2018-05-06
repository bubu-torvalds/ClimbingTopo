package mb.app.climbingTopo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Maxime
 *
 */
//TODO consumes from https://restcountries.eu/#api-endpoints-response-example
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
	
	private String name;
	
	private String alpha3Code;
	
	private String flag;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", alpha3Code=" + alpha3Code + ", flag=" + flag + "]";
	}

}
