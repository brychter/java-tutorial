//folder to store the class
package tutorial1;
import java.util.Scanner;

class Demo {
	//method
	void method1() {
		System.out.println("This is a default constructor");
	}
	//attr
	String name;
	int age;
	
	int method2(){
		int num = 12;
		return num;
	}
	
	int getAge(){
		return age;
	}
}

public class Application {

	// El método main tiene un array de string como argumento
	public static void main(String[] args) {
		
		Demo dem = new Demo();
		dem.name = "hola";
		dem.age = 22;
		dem.method1();
		int m = dem.method2();
		System.out.println(dem.name);
		System.out.println(m);
		
		int age = dem.getAge();
		System.out.println("age is " + age);
		/*
		 * int num = 92; System.out.println(num);
		 * 
		 * // class var instance of object String text = "Hello";
		 * System.out.println(text);
		 * 
		 * int value = 0;
		 * 
		 * while (value < 10) { System.out.println(value); value += 1; }
		 * 
		 * for (int i=0; i <12; i++){ System.out.println(i); }
		 * 
		 * if (4 == 4){ System.out.println("true"); }
		 */

		Scanner input = new Scanner(System.in);

		/*
		 * String line = input.nextLine(); int val = input.nextInt();
		 * System.out.println(line); System.out.println(val);
		 * 
		 */

		int[] values;
		int[] numbers = { 5, 6, 7 };
		values = new int[3];
		//System.out.println(values[0]);
		
		String[] texts = {"a", "b", "c"};
		for (String text: texts){
			System.out.println(text);
		}
		
		//Array multidimensional
		int[][] grid = {
				{3,4,5},
				{1,2,3}
		};
		String[][] newTexts = new String[2][3];
		newTexts[0][1] = "Hey";
		System.out.println(grid[1][1]);
		System.out.println(newTexts[0][1]);
		
	}

}
