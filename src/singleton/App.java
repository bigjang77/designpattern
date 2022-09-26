package singleton;

public class App {
	
	public static void main(String[] args) {
		President p1 = President.getInstance();
		//President p3 = new President();//디폴트 생성자 x 이미 생성자를 만들어서
	}
}
