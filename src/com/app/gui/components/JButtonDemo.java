package com.app.gui.components;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

public class JButtonDemo{
	
	JLabel jlab;
	JFrame jframe;
	
	JButtonDemo() {
		jframe = new JFrame("Button Demo");
		jlab = new JLabel();
		jframe.setLayout(new FlowLayout());
		jframe.setSize(300, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon france = new ImageIcon("france.gif");
		ImageIcon germany = new ImageIcon("germany.gif");
		JButton jb = new JButton("France", france);
		JButton jg = new JButton("Germany", germany);
		
		jb.setActionCommand("France");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You selected " + e.getActionCommand());
			}
		});
		
		jg.setActionCommand("Germany");
		jg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You selected " + e.getActionCommand());
			}
		});
		
		jframe.add(jb);
		jframe.add(jlab);
		jframe.add(jg);
		jframe.setVisible(true);
	}

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new JButtonDemo();
			}
		});
	}
}
