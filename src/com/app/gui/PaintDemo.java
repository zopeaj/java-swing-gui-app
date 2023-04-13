package com.app.gui;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class PaintDemo {
	
	JLabel jlab;
	PaintPanel pp;
	
	public PaintDemo() {
		//Create a new JFrame container
		JFrame jfrm = new JFrame("Paint Demo");
		
		//Give the frame an initial size 
		jfrm.setSize(200, 150);
		
		//Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create the panel that will be painted.
		pp = new PaintPanel();
		
		//Add the panel to the content pane. Because the default 
		//border layout is used, the panel will automatically be sized
		//to fit the center region.
		jfrm.add(pp);
		
		//Display the frame.
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new PaintDemo();
			}
		});
	}

}
