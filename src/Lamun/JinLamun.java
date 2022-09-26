package Lamun;

public class JinLamun implements Lamun{
	
	private final String NAME = "진라면";

	@Override
	public String cook() {
		System.out.println("라면완성");
		return NAME;
	}
	
	
}
