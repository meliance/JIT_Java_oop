//we use sorting if each elements are unique
package com.mycompany.secondmax;

//import java.util.Arrays;
public class SecondMax {
    

    public static void main(String[] args) {
        int num[] = {2, 4, 5, 21, 12, 21, 8};
        int n = num.length;
       // int MIN_VALUE=0;
       // Arrays.sort(num);//sort the array
        int highest =Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (num[i] > highest) {
                secondHighest = highest;
                highest = num[i];
            }

            if (num[i] < highest && num[i] > secondHighest) {
                secondHighest = num[i];
            }
        }
        //System.out.println("second highest number is:" +num[n-2]);
        System.out.println("second highest number is:" + secondHighest);
    }
}

