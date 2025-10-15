import java.util.*;
public class BinarySearch
{
	static int binSearch(int A[], int left, int right, int x)
	{
		int mid =0;
		while(left<=right)
		{
			mid = (left + right)/2;
			if(A[mid]==x)
			return mid;
			else if(A[mid]>x)
			right=mid-1;
			else
			left= mid+1;
		}
		return -1;
	}
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int A[]=new int[10];
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		System.out.print("Enter the element to be searched : ");
		int x = sc.nextInt();
		int result = binSearch(A,0,n-1,x);
		if(result==-1)
		System.out.println("Element not found : "+x);
		else
		System.out.print("Element Found : "+x);
		sc.close();
	}
}
