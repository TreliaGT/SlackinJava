/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Trelia
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         QueueX q = new QueueX();
        for(int i =0; i <= 4; i++){
            q.insert(i);    
        } 
        
        for(int i =0; i < 3; i++){
            q.remove();
        }
        
         for(int i =0; i <= 4; i++){
            q.insert(i);    
        } 
        
        int loopnum = 0;
        while(loopnum < q.size()){
            System.out.print(q.View(loopnum));
            loopnum++;
        }
    }
    
   
    
}
