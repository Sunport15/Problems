package com.Sunidhi;

import java.util.Scanner;

public class Main {


     static int longestPalSubstr( ) {
	// Dynamic programming using matrix
         System.out.println("Enter String : ");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

        for(int g = 0;g<s.length();g++){
            for(int i = 0, j = g; dp.length > j; i++,j++){
                if(g==0){
                    dp[i][j] = true;
                    for(int k =i;k<=j;k++){
                        System.out.print(s.charAt(k));
                    }
                    System.out.println();
                }else if(g==1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        for(int k =i;k<=j;k++){
                            System.out.print(s.charAt(k));
                        }
                        System.out.println();
                    }else{
                        dp[i][j] =false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true){
                        dp[i][j] = true;
                        for(int k =i;k<=j;k++){
                            System.out.print(s.charAt(k));
                        }
                        System.out.println();

                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    count++;
                }
            }
        }
        //System.out.println(count);
        return count;
    }


    public static void main(String[] args)
    {


        int number = longestPalSubstr();
        System.out.println(number);
    }
}