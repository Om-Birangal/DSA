import java.util.*;
public class QuickSort {
    
    static int partition(int A[], int l, int h) {
        int pivot = A[l];
        int i = l, j = h;
        
        while (i < j) {
            while (i < h && A[i] <= pivot) i++;
            while (A[j] > pivot) j--;
            
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        
        int temp = A[l];
        A[l] = A[j];
        A[j] = temp;
        
        return j;
    }

    static void quickSort(int A[], int l, int h) {
        if (l < h) {
            int j = partition(A, l, h);
            quickSort(A, l, j - 1);
            quickSort(A, j + 1, h);
        }
    }

    public static void main(String s[]) {
        int A[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Before sorting: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        quickSort(A, 0, A.length - 1);

        System.out.println("After sorting: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
        sc.close();
    }
}

