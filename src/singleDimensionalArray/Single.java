package singleDimensionalArray;

public class Single {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[2]);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array Value at Index "+i+" is : "+arr[i]);
		}
		
		//Used for Objects--forin(foreach upto jdk7) loop
		for(int x:arr) {
			System.out.println("Array Value is : "+x);
		}
		

	}

}
