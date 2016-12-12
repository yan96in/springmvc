/**
 * 
 */
package springmvc.chapter01.bean;

/**
 * @author yan96in
 *
 */
public class Address {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	public Address(String line1, String line2, String city, String state, String zipCode, String country) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	@Override
	public String toString() {
		return line1+"\n"+line2+"\n"+city+"\n"+state+" "+zipCode+"\n"+country;
	}
	
}
