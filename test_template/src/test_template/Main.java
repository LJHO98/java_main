package test_template;

public class Main {

	public static void main(String[] args) {
		System.out.println("===커피 제조===");
		Coffee drink1 = new Coffee();
		drink1.recipe();
		System.out.println("===티 제조===");
		Tea drink2 = new Tea();
		drink2.recipe();
	}

}
