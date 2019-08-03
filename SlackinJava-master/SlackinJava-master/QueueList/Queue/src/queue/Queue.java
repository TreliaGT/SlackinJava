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
         LinkList q = new LinkList();
         
        for(int i =0; i <= 4; i++){
            q.insertFirst(i,i);    
        } 
        
        for(int i =0; i < 3; i++){
            q.deleteFirst();
        }
        
         for(int i =0; i <= 4; i++){
            q.insertFirst(i,i);    
        } 
        
        q.displayList();
    }
    
   
    
}
