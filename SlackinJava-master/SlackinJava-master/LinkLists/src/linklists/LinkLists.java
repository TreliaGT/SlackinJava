/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklists;

/**
 *
 * @author V244682
 */
public class LinkLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkList theList = new LinkList();
		System.out.println("List first to last: ");
		//inserting
                for (int i = 0 ; i < 4; i++){
                   theList.insertFirst(i, i);
                }
		
		
		//calls display method
		theList.displayList();
		
                //Queue method
                System.out.println("Queue First in First out");
	
		  LinkList Queuelist = new LinkList();
                    for (int i = 0 ; i < 4; i++){
                   Queuelist.insertFirst(i, i);
                }
                   Queuelist.displayList();
		 System.out.println("remove first");
                  Queuelist.deleteFirst();
                  Queuelist.displayList();
                   
                  //Stack Method
                 System.out.println("Stack First in last out");
                 LinkList StackList = new LinkList();
                    for (int i = 0 ; i < 4; i++){
                   StackList.insertFirst(i, i);
                }
                    StackList.displayList();
                    System.out.println("Remove Last");
                    
	
    }
    
}
