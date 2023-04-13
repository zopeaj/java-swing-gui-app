package com.app.gui.components;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

public class JCheckBoxDemo {
	
	JFrame jf = new JFrame("CheckBoxDemo");
	JLabel jlab = new JLabel("Select Languages");
	JCheckBox cn = new JCheckBox();
	
	private class itemStateChanged implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			cn = (JCheckBox) e.getItem();
			if(cn.isSelected()) 
				jlab.setText(cn.getText() + " is selected");
			else 
				jlab.setText(cn.getText() + " is cleared");
		}
	}
	
	JCheckBoxDemo() {
		jf.setSize(500, 500);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(new itemStateChanged());
		jf.add(cb);
		

	    cb = new JCheckBox("C++");
	    cb.addItemListener(new itemStateChanged());
	    jf.add(cb);

	    cb = new JCheckBox("Java");
	    cb.addItemListener(new itemStateChanged());
	    jf.add(cb);

	    cb = new JCheckBox("Perl");
	    cb.addItemListener(new itemStateChanged());
	    jf.add(cb);
		
		
		jf.add(cn);
		jf.setVisible(true);
	}
	
	public ItemEvent itemStateChangeMeth(ItemEvent e) {
		return e;
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
