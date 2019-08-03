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
   LinkList list = new LinkList();
    public Reverser (String in){
        input = in;
    }
    
    public String doRev(){
        int first = 0;
        char[] a = input.toCharArray();
        String output = "";
        for(int i = 0; i < a.length; i++){
             list.insertFirst(first, a[i]);
             first++;
        }
         for(int i = 0; i < a.length; i++){
             output += list.find(i);
        }
      return output;
    }
}
