package immutableClass;

public class Address {

	private String city;
	private String country;
	private int pin;

	

	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

}