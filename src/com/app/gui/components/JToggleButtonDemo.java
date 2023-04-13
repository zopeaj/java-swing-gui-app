package com.app.gui.components;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

public class JToggleButtonDemo {

	JLabel jlab;
	JToggleButton jtbn;
	JFrame jft;
	public JToggleButtonDemo() {
		jlab = new JLabel();
		jtbn = new JToggleButton("Toggle Button Demo");
		jft = new JFrame("JToggle Button Demo");
		jft.setSize(500, 500);
		jft.setLayout(new FlowLayout());
		jft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jlab.setText("Button is off");
		jtbn.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(jtbn.isSelected())
					jlab.setText("Button is on.");
				else 
					jlab.setText("Button is off");
			}
		});
		
		jft.add(jtbn);
		jft.add(jlab);
		jft.setVisible(true);
	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override
			public void run() {	
				new JToggleButtonDemo();
			}
		});
	}
}
