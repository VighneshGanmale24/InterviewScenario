package immutableClass;

public class ImmutableStudent {
	
	private final int roll;
	private final String name;
	private final Address address;

	

	public ImmutableStudent(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		Address dummyAddress = new Address();
		dummyAddress.setCity(address.getCountry());
		dummyAddress.setCountry(address.getCity());
		dummyAddress.setPin(address.getPin());

		this.address = dummyAddress;
	}

	public int getroll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {

		Address cloneAddr = new Address();
		cloneAddr.setCity(this.address.getCity());
		cloneAddr.setCountry(this.address.getCountry());
		cloneAddr.setPin(this.address.getPin());
		return cloneAddr;

	}

	@Override
	public String toString() {
		return "ImmutableStudent [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	
}
