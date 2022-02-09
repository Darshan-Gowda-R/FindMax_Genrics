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

		String s1 = "Apple";
		String s2 = "Peach";
		String s3 = "Banana";

		TestCode max = new TestCode();
		int result = max.maxOfThree(a, b, c);
		float result1 = max.maxOfThree(a1,b1,c1); 
		String result2 = max.maxOfThree(s1,s2,s3);

		System.out.println("the Max Integer is "+ result);
		System.out.println("the Max FLoat is "+ result1);
		System.out.println("the Max String is "+ result2);
	}

}



public class TestCode {

	public int  maxOfThree(int a,int b,int c) {

		return (a > b && a > c)?(a):(b > a && b > c)? (b):(c);

	}

	public float  maxOfThree(float a,float b,float c) {

		return (a > b && a > c)?(a):(b > a && b > c)? (b):(c);

	}

	public String  maxOfThree(String a,String b,String c) {

		return (a.compareTo(b) == 1 && a.compareTo(c) ==1 )?(a):(b.compareTo(a) == 1 && b.compareTo(c) == 1)? (b):(c);

	}


}


