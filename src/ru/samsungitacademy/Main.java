package ru.samsungitacademy;

public class Main {

    public static void main(String[] args) {
 /* 0 0 0 0 1
    0 0 0 1 2
    0 0 1 2 2
    0 1 2 2 2
    1 2 2 2 2 */
        int n = 5;
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=n-i-1;j<n;j++) {
                a[i][j] = 1;
                a[i][n-i-1] = 2;
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
