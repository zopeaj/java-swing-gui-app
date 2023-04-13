package com.app.gui;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class JLabelTextField{


	JTextField jtf;
	JFrame jfr;
	JFrame frm;
	// create the status bar panel and shove it down the bottom of the frame
	JPanel statusPanel;
	JLabel statusLabel;
	

	
	public JLabelTextField() {
		jfr.setLayout(new FlowLayout());
		
		frm.setLayout(new BorderLayout());
		frm.setSize(200, 200);
		
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frm.add(statusLabel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(frm.getWidth(), 16));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		
		statusLabel = new JLabel();
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		//Add text field to content pane.
		jtf = new JTextField(15);
		jfr.add(jfr);
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("status");
			}
		});
		frm.setVisible(true);
	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override 
			public void run() {
				new JLabelTextField();
			}
		});
	}
}