/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayGround;

import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),tot=0;
        int[][] ar = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=s.nextInt();
                if(i==j){
                    tot+=ar[i][j];
                }
                if(j==(n-1-i)){
                    tot-=ar[i][j];
                }
            }
        }
        System.out.println(Math.abs(tot));
    }
}
