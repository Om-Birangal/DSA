import java.util.*;
public class LinearSearch{
    public static void main(String args[] ){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int A[]=new int[size];        
        
        //input
        for(int i =0; i<size;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find :");
        int x = sc.nextInt();
        //output
        for(int i=0; i<A.length;i++){
            if(x==A[i])
                System.out.println("Element found at index : " + i);
            else
                System.out.println("Element not found at index : " + i);
        }
        sc.close();
    }
}
