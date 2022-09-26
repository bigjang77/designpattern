package king;

public class King {

	private static King instance = new King("조지 3세");
	
	public static King getInstance() {
		return instance;
	}
	
	private String name;
	
	private King(String name) {
		this.name = name;
	}
}
