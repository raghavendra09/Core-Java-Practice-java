package multiDimensionalArray;
public class Multi {
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		
		System.out.println(arr[0][1]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("Array Value at Index "+i+","+j+" is "+arr[i][j]);				
			}
		}
		
		
		for(int[] x:arr) {
			for(int y:x) {
			System.out.println("Array Value is "+y);				
		}
	 }
 }
}
