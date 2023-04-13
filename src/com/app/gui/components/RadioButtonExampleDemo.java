package com.app.gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class RadioButtonExampleDemo {

	JFrame jfr = new JFrame();
	JLabel jlab = new JLabel("Select One");
	JRadioButton b1 = new JRadioButton("A");
	JRadioButton b2 = new JRadioButton("B");
	JRadioButton b3 = new JRadioButton("C");
	ButtonGroup bg = new ButtonGroup();	
	
	public RadioButtonExampleDemo() {
		jfr.setSize(500, 500);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr.setLayout(new FlowLayout());
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You selected " + e.getActionCommand());;
			}
		});
		
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		jfr.setVisible(true);
	}

	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new RadioButtonExampleDemo();
			}
		});
	}
}
