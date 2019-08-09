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
public class LinkList {
    private Link first; //reference to first link
	
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
	
	public Link find(int key) // find link with given key
	{ // (assumes non-empty list)
		Link current = first; // start at 'first'
		while(current.iData != key) // while no match,
		{
			if(current.next == null) // if end of list,
				return null; // didn't find it
			else // not end of list,
				current = current.next; // go to next link
		}
		return current; // found it
	}
	
	//inserts in first link
	public void insertFirst(int id, double dd)
	{
		Link newLink = new Link(id, dd);
		newLink.next = first; //newLink is pointing to old first
		first = newLink; //first is pointing to newLink
	}
	
	public Link delete(int key) // delete link with given key
	{ // (assumes non-empty list)
		Link current = first; // search for link
		Link previous = first;
		while(current.iData != key)
		{
			if(current.next == null)
			return null; // didnâ€™t find it
			else
		{
		previous = current; // go to next link
		current = current.next;
		}
		} // found it
		if(current == first) // if first link,
			first = first.next; // change first
		else // otherwise,
			previous.next = current.next; // bypass it
		return current;
	}
	
	//deletes first link
	public Link deleteFirst()
	{
		Link temp = first;
		first = first.next; //delete it. First is pointing to old next
		return temp;
	}
	
	//displays the values in the links
	public void displayList()
	{
		
		Link current = first;
		while (current!=null)
		{
			current.displayLink();
			current=current.next; 
		}
	}

}
