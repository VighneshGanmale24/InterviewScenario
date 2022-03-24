package immutableClass;

public class Test {

	public static void main(String[] args) {

		Address add = new Address();

		add.setCity("KoLHapuR");
		add.setCountry("InDiA");
		add.setPin(416012);

		ImmutableStudent s1 = new ImmutableStudent(123, "ShuBhu", add);

		System.out.println("Original " + s1);

		s1.getAddress().setCity("Sangvade");
		s1.getAddress().setPin(416202);
		s1.getAddress().setCountry("New Zealand");
		System.out.println("Modified " + s1);
	}

}
