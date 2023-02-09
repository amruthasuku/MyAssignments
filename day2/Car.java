package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		int numb = obj.getRegistrationNumber();
		System.out.println("Reg no:" + numb);
		String numb2 = obj.ownersName();
		System.out.println("Owners name:" + numb2);
		boolean numb3 = obj.IsPunctured();
		System.out.println("Is Punctured :" + numb3);
		int numb4 = obj.subTwoNum(4, 2);
		System.out.println("Sub of two num:" + numb4);
		int numb5 = obj.mulThreeNum(2, 3, 4);
		System.out.println("Mul of three num:" + numb5);
		int numb6 = obj.divideTwoNum(4, 2);
		System.out.println("Div of two num:" + numb6);
	}

	public int getRegistrationNumber() {
		return 1234;
	}

	private String ownersName() {
		return "Amrutha";
	}

	void CarModel() {
		System.out.println("Swift");
	}

	public boolean IsPunctured() {
		return true;
	}

	public int subTwoNum(int num1, int num2) {
		return num1 - num2;
	}

	public int mulThreeNum(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	public int divideTwoNum(int num1, int num2) {
		return num1 / num2;
	}

}
