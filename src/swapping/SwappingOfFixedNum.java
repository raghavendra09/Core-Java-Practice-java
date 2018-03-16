package swapping;

public class SwappingOfFixedNum {
      
	int binerySearch(int arr[],int key)
	{
		
		int lowindex=0;
		int highindex=arr.length-1;
		
		while(lowindex<=highindex)
		{
			
			int mid=(lowindex+highindex)/2;
			if(arr[mid]<key)
			{
				lowindex=mid+1;
			}
			else if(arr[mid]>key)
			{
				highindex=mid-1;
			}
			
			else
			{
				System.out.println("Index found value is:"+mid);
				return mid;	
			}
			
			
		}
		if(lowindex>highindex)
		{
			System.out.println("Key not found");
		}
		return highindex;
		
		

	}
       	
	
	public static void main(String[] args)
	{
		SwappingOfFixedNum bs=new SwappingOfFixedNum();
		int arr[]= {1,2,3,4,5,6};
	int a[]= {7,8,9,10,11,12};
		 int key=4;
		 int key1=9;
		 int c;
		int index=bs.binerySearch(arr,key);
		int index1=bs.binerySearch(a,key1);
		
System.out.println(index);
System.out.println(index1);

c=arr[index];
arr[index]=a[index1];
a[index1]=c;
for(int i=0;i<arr.length;i++) {
	System.out.println("Array arr[] is: "+arr[i]);
}
for(int j=0;j<a.length;j++) {
	System.out.println("Array a[] is: "+a[j]);
}

	}

}
