/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.reverse;

/**
 *
 * @author Makoa
 */
import java.util.Scanner;
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String str,s;
        System.out.print("Enter string: ");
        str = in.nextLine();
        s = str;
        str = new StringBuffer(str).reverse().toString();
        
        System.out.println("Reversed string: "+str);
        System.out.println();
        
        System.out.println("Testing");
        
    }
    
}
