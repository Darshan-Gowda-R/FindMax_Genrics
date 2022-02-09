import java.util.*;
public class TestCase {

	public static void main(String[] args) {
		int a = 10;
		int b = 40;
		int c = 30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floating point values : ");
		float a1 = sc.nextFloat();
		float b1 = sc.nextFloat();
		float c1 = sc.nextFloat();
		TestCode max = new TestCode();
		int result = max.maxOfThree(a, b, c);
		float result1 = max.maxOfThree(a1,b1,c1); 
		System.out.println("the Max Integer is "+ result);
		System.out.println("the Max FLoat is "+ result1);
	}

}



public class TestCode {

	public int  maxOfThree(int a,int b,int c) {

		return (a > b && a > c)?(a):(b > a && b > c)? (b):(c);

	}

	public float  maxOfThree(float a,float b,float c) {

		return (a > b && a > c)?(a):(b > a && b > c)? (b):(c);

	}




}


