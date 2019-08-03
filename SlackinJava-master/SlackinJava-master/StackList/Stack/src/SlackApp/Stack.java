/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlackApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author V244682
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true){
            System.out.print("Enter a String: ");
            System.out.flush();
            input = getString();
            if(input.equals("")){//quit if [enter]
                break;
            }else{
                Reverser theReverser = new Reverser(input);
                output = theReverser.doRev();
                System.out.println("Reversed: " + output);
            }
        }
    }   //end main
    
       public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
    
}
