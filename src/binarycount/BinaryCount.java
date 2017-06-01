/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarycount;

import java.util.Scanner;

/**
 *
 * @author HP User
 */
public class BinaryCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String bin = Integer.toBinaryString(n);
        char[] chars = bin.toCharArray();
        
        int maxOnes = 0;
        int currentOnes = 0;
        for(char c : chars){
            if (c == '1'){
                currentOnes++;
            }
            else {
                if (currentOnes>maxOnes){
                    maxOnes = currentOnes;
                }
                currentOnes = 0;
            }
        }
        
        //end case
        if (currentOnes>maxOnes){
            maxOnes = currentOnes;
        }
        
        System.out.println(maxOnes);
    }
    
}
