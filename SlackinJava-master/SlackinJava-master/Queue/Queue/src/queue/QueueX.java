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
public class QueueX {
   /**
 *
 * @author V244682
 */
   int maxSize = 10;
   int QueueArray [] = new int[maxSize];
   int first = 0;
     public void insert(int j){//put item on top of Queue
        for (int i = 0; i < maxSize; i++) {
            if (QueueArray[i] == 0) {
             QueueArray[i] = j;
            break;
            }
        }
    }
    
    public void remove(){//take item from top of Queue
    for (int i = 0; i < size()-1; i++) {
            QueueArray[i] = QueueArray[i+1];
    }
    }
    
    
    public int View(int j){//peek at top of Quene
        return QueueArray[j];
    } 
    
    public int size(){
        return QueueArray.length;
    }
}
