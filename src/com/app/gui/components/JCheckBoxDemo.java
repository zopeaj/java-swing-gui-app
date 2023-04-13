package com.app.gui.components;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

public class JCheckBoxDemo {
	JFrame jf = new JFrame("CheckBoxDemo");
	
	JCheckBoxDemo() {
		jf.setSize(500, 500);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			
			}
		});
		
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new JCheckBoxDemo();
			}
		});
	}

}
