/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlackApp;

/**
 *
 * @author Trelia
 */
public class LinkList {
      private Links first; //reference to first link
	
	//initialises the variable
	public LinkList()
	{
		first = null;		
	}
	
	//checks if first link is empty
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public Links find(int key) // find link with given key
	{
		Links current = first; 
		while(current.iData != key) 
		{
			if(current.next == null) 
				return null; 
			else 
				current = current.next; 
		}
		return current; // found it
	}
	
	//inserts in first link
	public void insertFirst(int id, char dd)
	{
		Links newLink = new Links(id, dd);
		newLink.next = first;
		first = newLink; 
	}
	
	public Links delete(int key) // delete link with given key
	{ 
		Links current = first; 
		Links previous = first;
		while(current.iData != key)
		{
			if(current.next == null)
			return null; 
			else
		{
		previous = current; 
		current = current.next;
		}
		} // found it
		if(current == first) 
			first = first.next; 
		else 
			previous.next = current.next; 
		return current;
	}
	
	//deletes first link
	public Links deleteFirst()
	{
		Links temp = first;
		first = first.next; 
		return temp;
	}
	

	public void displayList()
	{
		System.out.println("List first to last: ");
		Links current = first;
		while (current!=null)
		{
			current.displayLink();
			current=current.next; 
		}
	}
}
