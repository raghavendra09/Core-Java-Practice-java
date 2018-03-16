package swapping;

public class SwappingArray {
	public static void main(String[] args) {
int a[]= {1,2,3};
int b[]= {4,5,6};
int c;
for(int i=0;i<a.length;i++) {
	c=a[i];
	a[i]=b[i];
	b[i]=c;
}
for(int i=0;i<a.length;i++) {
	System.out.println("Array a[] is: "+a[i]);
}
for(int j=0;j<b.length;j++) {
	System.out.println("Array b[] is: "+b[j]);
}
}
}
