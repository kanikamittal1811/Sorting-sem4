public class Bubblesort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                   
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    //after merge
    
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    
    public static void main(String args[]) 
    { 
        Bubblesort ob = new Bubblesort(); 
        int arr[] = {10,5,6,7,8,2,1}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } }

