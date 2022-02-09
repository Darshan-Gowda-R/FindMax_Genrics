
public class TestCase {

	public static void main(String[] args) {
		int a=10;
		int b = 40;
		int c=30;
		TestCode max = new TestCode();
		int result = max.maxOfThree(a, b, c);

		System.out.println("the Max value is "+ result);
	}

}



public class TestCode {

	public int  maxOfThree(int a,int b,int c) {

		return (a > b && a > c)?(a):(b > a && b > c)? (b):(c);

	}


}


