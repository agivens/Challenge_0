/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package givens_4_challenge0;

/**
 *
 * @author agivens
 */
public class Givens_4_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1; 
        for (i = 0; i < 100; i++) {
              if (isDivisiblebytwo(i)) {
                System.out.println("Davis");
            }
         }
    }

    static boolean isDivisiblebytwo(int a) {
        return (a % 2 == 0);
    }

    static boolean isDivisiblebythree(int b) {
        return (b % 3 == 0);
    }

    static boolean isDivisiblebyfive(int c) {
        return (c % 5 == 0);
    }

    static boolean isDivisiblebyeleven(int d) {
        return (d % 11 == 0);
    }
}
