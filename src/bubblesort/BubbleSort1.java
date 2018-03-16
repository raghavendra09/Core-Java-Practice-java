package bubblesort;

public class BubbleSort1 {
	
	 void bubbleSort() {
		 
		 int a[]= {2,4,6,10,8,12};
		 int t=0;
		 for(int i=0;i<a.length;i++) 
		 {
			 
			 for (int j=1;j<a.length-i;j++) 
			 {
				 if(a[j-1] > a[j])
				 {  
                     
                     t = a[j-1];  
                     a[j-1] = a[j];  
                     a[j] = t;  
			     }
		     }
		 }
		 for(int k=0;k<a.length;k++)
		 {
			 System.out.println(a[k]);
		 }
	}

	public static void main(String[] args) {
		
		BubbleSort1 bs = new BubbleSort1();
		bs.bubbleSort();
	}

}
