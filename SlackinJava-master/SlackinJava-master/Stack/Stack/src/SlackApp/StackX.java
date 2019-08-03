/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlackApp;

import java.lang.reflect.Array;

/**
 *
 * @author V244682
 */
public class StackX {
  char stackArray [] = new char[10];
  int top = 0;
   int maxSize = 10;
    
    public void push(char j){//put item on top of stack
        stackArray[++top] = j; // increment top , insert item
    }
    
    public char pop(){//take item from top of stack
        return stackArray[top--];//access item , decrement top
    }
    
    public char peek(){//peek at top of stack
        return stackArray[top];
    }
   
    public boolean isEmply(){//true if stack is empty
        return (top == -1);
    }
    
    public boolean isFull(){//true if stack is full
        return (top == maxSize-1);
    }
    
}
