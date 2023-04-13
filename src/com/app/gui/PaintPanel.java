package com.app.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PaintPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Insets ins; //holds the panel's insets
	
	Random rand; //used to generate random numbers
	
	
	//Construct a panel.
	public PaintPanel() {
		//Put a border around the panel.
		setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 2));
		rand = new Random();
	}
	
	//Override the paintComponent() method.
 	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x, y, x2, y2;
		
		//Get the height and width of the component.
		int height = getHeight();
		int width = getWidth();
		
		//Get the insets
		ins = getInsets();
		
		//Draw ten lines whose endpoints are randomly generated.
		for(int i = 0; i < 10; i++) {
			//Obtain random coordinate that define 
			//the endpoint of each line.
			x = rand.nextInt(width-ins.left);
			y = rand.nextInt(height-ins.bottom);
			x2 = rand.nextInt(width-ins.left);
			y2 = rand.nextInt(width-ins.bottom);
			
			//Draw the line.
			g.drawLine(x, y, x2, y2);
		}
	}
}
