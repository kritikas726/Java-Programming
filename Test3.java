package com.mycompany.foobar;

/**
 *
 * @author Kritika
 */
public class Test3 {
     public static void main(String[] args){
        int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int c[][]=new int[3][3];
        int i;
        int j = 0;
        for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               c[i][j]=a[i][j]+b[i][j];
           }
        }
        for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               System.out.println(c[i][j]+" ");
           }
        }
    }
}
