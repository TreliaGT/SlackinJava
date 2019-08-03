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
public class Links {
    	public int iData; 
	public char dData; 
	public Links next; //reference to next link
	
	

	public Links(int id, char dd)
	{
		iData = id;
		dData = dd;
	}
	
	public void displayLink()
	{
		System.out.println(iData +" "+ dData);
	}
}
