package SortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your first sorted list of numbers");
        String x = input.nextLine();
        System.out.println("Type in your second sorted list of numbers");
        String a = input.nextLine();
        String[] array1 = x.split(",");
        String[] array2 = a.split(",");
        System.out.println("First entered array = " + Arrays.toString(array1));
        System.out.println("Second entered array = " +  Arrays.toString(array2));

        int i =0, j = 0;
        List<String> finalArray = new ArrayList<String>();
        while (i < array1.length && j < array2.length) {
            if (Integer.parseInt(array1[i]) < Integer.parseInt(array2[j])) {
                finalArray.add(array1[i]);
                i++;
            } else if (Integer.parseInt(array1[i]) > Integer.parseInt(array2[j])) {
                finalArray.add(array2[j]);
                j++;
            } else {
                finalArray.add(array2[j]);
                i++;
                j++;
            }
        }
        while(i < array1.length) {
            finalArray.add(array1[i]);
            i++;
        }
        while (j < array2.length) {
            finalArray.add(array2[j]);
            j++;
        }
        System.out.println("Final merged array = " +  finalArray.toString());
       
    }
    
}
