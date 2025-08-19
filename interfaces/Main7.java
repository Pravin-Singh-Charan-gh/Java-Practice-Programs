package interfaces;

interface Sortable{
    public void sort(int[] arr);
    
}
// [1 ,2, 3, 4, 5]   5
class BubbleSort implements Sortable{
    @Override
    public void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++)
          for(int j=1;j<n-i;j++)
             if(arr[j-1]>arr[j])
                 {
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                 }
    }
}
class SelectionSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        // Get the length of the array
        int n = arr.length;
        
        // Outer loop for the current element
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}


public class Main7 {
    public static void main(String[] args) {
        int arr[]={3,5,7,3,1,4,6,8,30,22};
        BubbleSort b1=new BubbleSort();
        b1.sort(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();

        int brr[]={3,5,7,3,1,4,6,8,30,22};
        SelectionSort s1=new SelectionSort();
        s1.sort(brr);
        for(int i=0;i<brr.length;i++)
        System.out.print(brr[i]+" ");

    }
    
}

// 7. Write a Java program to create an interface Sortable with a method sort() that sorts an array 
// of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement
//  the Sortable interface and provide their own implementations of the sort() method.