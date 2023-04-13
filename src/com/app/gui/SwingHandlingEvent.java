package com.app.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingHandlingEvent {

	JLabel jlab;
	
	public SwingHandlingEvent() {
		
		//Create a new JFrame Container 
		JFrame jfrm = new JFrame("An Event Example");
		
		//Specify FlowLayout for the layou
		jfrm.setLayout(new FlowLayout());
		
		//Give the frame an initial size.
		
		jfrm.setSize(220, 90);
		
		//Template the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Make two buttons.
		JButton jbtnAlpha = new JButton("Alpa");
		JButton jbtnBeta = new JButton("Beta");
		
		//Add action listener for Alpha.
		jbtnAlpha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Alpha was pressed.");
				System.out.println("Alpha was pressed");
			}
		});
		
		//Add action listener for Beta.
		jbtnBeta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Beta was pressed.");
				System.out.println("Beta was pressed");
			}
		});
		
		//Add the buttons to the content pane.
		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
		
		//Create a text-based label.
		jlab = new JLabel("Press a Button");
		
		//Add the label to the content pane.
		jfrm.add(jlab);
		
		//Display the frame.
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override 
			public void run() {
				new SwingHandlingEvent();
			}
		});
	}
}
