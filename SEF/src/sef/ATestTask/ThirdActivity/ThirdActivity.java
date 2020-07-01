package sef.ATestTask.ThirdActivity;
//Needs to be completed

//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

	public static void main(String[] args) {
		ThirdActivity ta = new ThirdActivity();
		// TODO handle exception on proper way

		try {
			ta.validateUser("Ivan");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ta.catchExeption();
		ta.catchMe(8, 8);

	}

	void catchExeption() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This should get printed even if there is an exception");
		}
	}

	void validateUser(String name) throws Exception {
		String[] validUsers = { "John", "Mike", "Missi", "Peacy" };
		boolean flag = false;
		// TODO if name in a list -> set flag=true
		// if at the end flag=0 -> throw the exeption

		for (String s : validUsers) {
			if (name == s) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			throw new Exception("Invalid user");
		}
	}

	void catchMe(int num1, int num2) {

		try {
			// TODO Catch exeption
			int result = num1 / num2;
			System.out.println("The result is :" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// TODO prints a message "Thank you for using this program." always
			System.out.println("Thank you for using this program.");
		}
	}
}
