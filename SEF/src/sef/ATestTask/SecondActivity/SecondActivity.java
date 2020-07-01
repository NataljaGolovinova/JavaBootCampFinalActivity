package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println(calculator.sum(10.2, 5));
		System.out.println(calculator.divide(100, 33));
	}

	//TODO create the Calculator (here or in additional class)
	double sum(double a, double b) {
		return a + b;
	}

	double subtract(double a, double b) {
		return a - b;
	}

	double multiply(double a, double b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
		
	}
}
