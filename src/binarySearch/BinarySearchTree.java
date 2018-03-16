package binarySearch;

public class BinarySearchTree {
	public static void main(String []args) {
	int a[]= {1,2,3,4,5};
	int key=1;
	int low=0;
	int high=a.length-1;
	int mid = 0;
	while(low<=high) {
		mid=(low+high)/2;
			if(a[mid]<key) {
				low=mid+1;
			}
			else if(a[mid]>key) {
				high=mid-1;
			}
			else {
				System.out.println("Key Found "+a[mid]);
				break;
			}
	}
	if(low>high) {
		System.out.println("Key Not Found"+a[mid]);
	}
	
}
}