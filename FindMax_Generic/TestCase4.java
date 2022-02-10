//package generics;


import java.util.*;
public class TestCase {

	public static void main(String[] args) {
		Integer[] a = {10,20,30,40,59,19};
		//Integer b = 40;
		//Integer c = 30;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter 3 floating point values : ");
		Double[] d = {12.4,1234.45,9871.8634,18273.974,987.5};
		//Double b1 = sc.nextDouble();
		//Double c1 = sc.nextDouble();


		String[] s1 = {"Apple", "Peach", "Banana","Cat","Batman"};


		TestCode max = new TestCode();
		max.maxOfThree(a);
		max.maxOfThree(d);
		max.maxOfThree(s1);

	}

}



class TestCode <T extends Comparable <T>>{

	public < T extends Comparable <T>> void maxOfThree(T[] arr) {

		T result=arr[0];


		//result = (a.compareTo(b) > 0 && a.compareTo(c) > 0 )?(a):(b.compareTo(a) > 0 && b.compareTo(c) > 0)? (b):(c);
		for(T re : arr){
			if( result.compareTo(re) < 0 )
			{result = re;

			}
		}

		System.out.println("The max of the v "+ result);

	}



}
