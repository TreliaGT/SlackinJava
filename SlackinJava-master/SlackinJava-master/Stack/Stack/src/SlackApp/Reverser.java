/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlackApp;

/**
 *
 * @author V244682
 */
public class Reverser {
   String input;
   StackX stack = new StackX();
    public Reverser (String in){
        input = in;
    }
    
    public String doRev(){
        char[] a = input.toCharArray();
        String output = "";
        for(int i = 0; i < a.length; i++){
             stack.push(a[i]);
        }
         for(int i = 0; i < a.length; i++){
             output += stack.pop();
        }
      return output;
    }
}
