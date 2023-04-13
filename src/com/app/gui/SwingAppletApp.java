package com.app.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings({ "serial", "removal" })
public class SwingAppletApp extends JApplet {
	
	JButton jbtnAlpa;
	JButton jbtnBeta;
	JLabel jlab;
	
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			});
		}  catch(Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}
	
	@SuppressWarnings("deprecation")
	private void makeGUI() {
		//Set the aplet to use flow layout.
		setLayout(new FlowLayout());
		
		//Make two buttons 
		jbtnAlpa = new JButton("Alpa");
		jbtnBeta = new JButton("Beta");
		
		//Add action listener for Alpha.
		jbtnAlpa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Alpha was pressed.");				
			}
		});
		
		//Add actionlistener for Beta
		jbtnBeta.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Beta was pressed.");
			}
		});
		
		//Add the buttons to the content pane.
		add(jbtnAlpa);
		add(jbtnBeta);
		
		//create a text-based label
		jlab = new JLabel("Press a button.");
		
		//Add the label to the content pane.
		add(jlab);
	}
}
