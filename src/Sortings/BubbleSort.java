package Sortings;

public class BubbleSort {
	static int a[]= {4,2,6,1,3,5,7};
	
public void Sorting() {
	int k=0;
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<(n-i);j++) {
			if(a[j-1]>a[j]) {
				k = a[j-1];
				a[j-1]=a[j];
				a[j]=k;
			}
			
		}
	}
	 for(int l=0; l < n; l++){  
         System.out.print(a[l] + " ");  
 }  
}
	public static void main(String[] args) {
BubbleSort bs=new BubbleSort();
bs.Sorting();
}
}