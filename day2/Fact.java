package week1.day2;

public class Fact {
	public static void main(String[] args) {
		int i = 5;
		int fact = 1;
		for (i = 1; i <= 5; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
