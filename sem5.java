import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class sem5 {
private static String[] args;
    // Cтруктуру телефонной книги с помощью HashMap    
    /*public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
        HashMap<String, String> TelephoneBook = new HashMap<String, String>();
        TelephoneBook.put("Alla", "78945612");
        TelephoneBook.put("Lev", "78525612");
        TelephoneBook.put("Vlada", "78945852");
        TelephoneBook.put("Garfield", "78941232");
        TelephoneBook.put("Mila", "78943572");
        

        
        System.out.println("Enter Name= ");
        String name = iScanner.next().toUpperCase();
        
        if(TelephoneBook.containsKey(name)) {
            System.out.println(name +"="+TelephoneBook.get(name));
            iScanner.close(); 
        } 
    
// найти и вывеcти повторяющиеся имена с количеством повторений из списка сотрудников.
    
        String[] AllEmployee = new String[]{"Alla", "Dima", "Mila", "Lev", "Garfield"};
        List<String> employeeList = new ArrayList<>();
        for (int i = 0; i<10; i++)    {
            employeeList.add(AllEmployee[(int)(Math.random()*AllEmployee.length)]);
        }
        
        System.out.println();
        employeeList.sort(null);
        for (String string : employeeList) {
            System.out.print(string + " "); 
        }
        System.out.println();
        int count = 1;
        int lengthList = employeeList.size();
        for (int i = 1; i < lengthList; i++)  {
            if (employeeList.get(i)!=employeeList.get(i-1))   {
                System.out.println(employeeList.get(i-1)+" " +count);
                count = 1;
            }
            else count++;
        }
        System.out.println(employeeList.get(lengthList-1) + " " +count);
    }*/
//  Aлгоритм пирамидальной сортировки (HeapSort).   
    
    static void heapify(int a[], int n, int i)  {  
        int largest = i; // Initialize largest as root  
        int left = 2 * i + 1; // left child  
        int right = 2 * i + 2; // right child  
    // If left child is larger than root  
        if (left < n && a[left] > a[largest])  
        largest = left;  
    // If right child is larger than root  
        if (right < n && a[right] > a[largest])  
        largest = right;  
    // If root is not largest  
        if (largest != i) {  
        // swap a[i] with a[largest]  
        int temp = a[i];  
        a[i] = a[largest];  
        a[largest] = temp;  
          
        heapify(a, n, largest);  
        }  
    }  
//Function to implement the heap sort  
    static void heapSort(int a[], int n)  {
        for (int i = n / 2 - 1; i >= 0; i--)  
        heapify(a, n, i);  
  
// One by one extract an element from heap  
        for (int i = n - 1; i >= 0; i--) {  
        //Move current root element to end
        // swap a[0] with a[i]  
            int temp = a[0];  
            a[0] = a[i];  
            a[i] = temp;  
          
            heapify(a, i, 0);  
        }  
    }  
//function to print the array elements 
    static void printArr(int a[], int n)  { 
        for (int i = 0; i < n; ++i)  
        System.out.print(a[i] + " ");  
    }  
    public static void main(String args[])   {  
        sem5.args = args;
        int a[] = {55, 17, 2, 50, 5, 13, -4};  
        int n = a.length;  
        System.out.print("Before sorting array elements are - \n");  
        printArr(a, n);  
        heapSort(a, n);  
        System.out.print("\nAfter sorting array elements are - \n");  
        printArr(a, n);  
    }  
}  


