package com.app.gui;

import javax.swing.*;

class SwingDemo {

	SwingDemo() {
		
		//Create a new JFrame container
		JFrame jfrm = new JFrame("A simple Swing Application");
		
		//give the frame an initial size.
		jfrm.setSize(275, 100);
		
		
		//Terminate the program when the user closes the application 
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a text-based label.
		JLabel jlabl = new JLabel("Swing means powerful GUIs.");
		
		jfrm.add(jlabl);
		
		//display the frame 
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingDemo();
			}
		});
	}
}
