
package javaapplication3;

import java.util.ArrayList;
import java.util.Arrays;

public class DataStructureAssiment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // name : fares ahmed amer
    // id : 2405404 
    // Question 1 
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5};
        int sum = 0;

 
        for (int num : numbers) {
            sum += num;
        }


        System.out.println("Sum of array elements: " + sum);
        
        // -------------------
        // Question 2 



        
        int[] temp = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j] = numbers[i];
                j++;
            }
        }
        temp[j] = numbers[numbers.length - 1];
        j++;

        System.out.print("Array without duplicates: [");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i]);
            if (i < j - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        
        // -------------------
        // name : yahya mohamed abdulallah
        // id : 2405144
        // Question 3
        
        int key=1;
        int count=0;
        for (int num : numbers) {
            if (num != key) 
                count++;
        }
        int[] result = new int[count];
        int index = 0; 
        
         for (int num : numbers) {
            if (num != key) {
                result[index++] = num;
            }
         }
             System.out.println("the result array : "+ Arrays.toString(result));
             
         // -------------------
        // name : ziad hassan
        // id : 2405143
        // Question 4
        
        ArrayList<Integer> list11 = new ArrayList<>();

// Add all numbers from the array to the list
for (int num : numbers) {
    list11.add(num);
}

// Calculate the sum
int sum12 = 0;
for (int check : list11) {
    sum12 += check;
}

// Print the result
System.out.println("Sum of ArrayList elements: " + sum12);
        
        // -------------------
        // name : bishoy magdy fawzy
        // id : 2405128
        // Question 5   
        
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0;
        for (int n : numbers)
        list.add(n);
        for (int n : list) s += n;
        System.out.println("summation : " + s);

                // -------------------
        // name : hazem mahmoud mohamed
        // id : 2405407
        // Question 6   
        
  
        int k = 1;

        
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : numbers) {
            list1.add(num);
        }

     
        ArrayList<Integer> results = new ArrayList<>();
        

        for (int num11 : list1) {
            if (num11 != k) {
                results.add(num11);
            }
        }

   
        System.out.println("Output: " + results);

    }
    
}
