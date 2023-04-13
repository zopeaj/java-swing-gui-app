package com.app.gui.components;

import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class JTextFieldDemo {
	JFrame frame = new JFrame();
	JPanel statusPanel = new JPanel();
	JLabel statusLabel = new JLabel();
	JTextField jtf;
	
	JTextFieldDemo() {
		frame.setLayout(new BorderLayout());
		frame.setSize(200, 200);

		// create the status bar panel and shove it down the bottom of the frame
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frame.add(statusPanel, BorderLayout.SOUTH);
		
		statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		
		//Add text field to content pane
		jtf = new JTextField(15);
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Show text when user preses Enter 
			}
		});
		
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusLabel.setText("status");
		statusPanel.add(statusLabel);

		frame.setVisible(true);
	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new JTextFieldDemo();
			}
		});
	}
}
