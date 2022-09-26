package Lamun;

public class App {

	public static void main(String[] args) {
		LamunCooker l = new LamunCooker();
		l.boil(new JinLamun());
		l.boil(new JinLamunAdapter(new JinLamun()));
	}
}
