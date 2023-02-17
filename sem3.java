import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Реализовать алгоритм сортировки слиянием
public class sem3 {
    /*
    public static void main(String[] args) {
        //FillPlanetsList();
        // DelListNumber();
        System.out.println("mergesort"); 
        int[] input = { 7, 57, 37, 11, 9, 60, 02, 70, 14, 23, 10 };
        System.out.println("array before sorting"); 
        System.out.println(Arrays.toString(input)); 
    // sorting array using MergeSort algorithm 
        mergesort(input);
        System.out.println("array after sorting using mergesort algorithm"); 
        System.out.println(Arrays.toString(input));
    }
    public static void mergesort(int[] input) { 
        mergesort(input, 0, input.length - 1); 
    }
    private static void mergesort(int[] input, int start, int end) { 
        // break problem into smaller structurally identical problems 
        int mid = (start + end) / 2; 
        if (start < end) { 
            mergesort(input, start, mid); 
            mergesort(input, mid + 1, end); 
        } 
            // merge solved pieces to get solution to original problem 
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1]; 
        while (first <= mid && last <= end) { 
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++]; 
        } 
        while (first <= mid) { tmp[i++] = input[first++];
        } 
        while (last <= end) { 
            tmp[i++] = input[last++]; 
        } 
        i = 0; 
        while (start <= end) { 
            input[start++] = tmp[i++]; 
        } 
    }


//Удалить четные числа из произвольного списока целых чисел
    public static void main(String[] args) {
        List <Integer> number=new ArrayList <Integer>();
        number.add(1);
        number.add(5);
        number.add(2);
        number.add(44);
        number.add(16);
     
    System.out.println("Unsorted List: "+number);
     
    for (int i=0;i<number.size();i++){      
        int even=number.get(i)%2;       
        if (even==0){
            System.out.println("This is Even Number:"+ number.get(i));
            number.remove(i);
            i--;
        }    
    }
     
    Collections.sort(number);
    System.out.println("Sorted List: "+number);
}

*/
//Найти минимальное, максимальное и среднее ариф из целочисленного списока ArrayList.
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer> ();

        Scanner input = new Scanner (System.in);
        int num = 0;
        int sum = 0;
        int avg = 0;
        int min = 0;
        int max = 0;
        int i = 0;
    
        for (i = 0; i < 3; ++i){

            System.out.println("Enter a number");
        
            num = input.nextInt();
            array.add(num);

            sum += num;
        }
    
    max = Collections.max(array);
    min = Collections.min(array);
    avg = sum / i;

    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + avg);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    }
}         



    

