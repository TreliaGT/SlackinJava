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
public class Link {
    	public int iData; //data item
	public double dData; //data item
	public Link next; //reference to next link
	
	
	//initialisation of two variables
	public Link(int id, double dd)
	{
		iData = id;
		dData = dd;
	}
	
	public void displayLink()
	{
		System.out.println(iData +" "+ dData);
	}
}
