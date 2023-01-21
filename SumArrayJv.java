
package com.mycompany.sumarray.jv;
import java.util.Scanner;
public class SumArrayJv {

    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.println("enter elements of first matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=r.nextInt();
            }
        }
        System.out.println("elements of first matrix are:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 System.out.print(a[i][j]+" ");
            }
             System.out.println();
        }
         System.out.println("enter elements of second matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=r.nextInt();
            }
        }
        System.out.println("elements of second matrix are:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 System.out.print(b[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("the sum of the matrix is :" );
         for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ") ;   
            }
              System.out.println();
        }
    }
}
