public class CatRunner {
	public static void main(String[] args) {
		Cat cat1 = new Cat("emergency food", 10, 500.0);
		cat1.introduce();
		cat1.printCatInfo();

		Cat cat2 = new Cat("emergency food 2", 5, 250.0);
		cat2.introduce();
		cat2.printCatInfo();
	}
}
