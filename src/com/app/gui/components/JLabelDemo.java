package com.app.gui.components;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.net.URL;

/*
 * <applet code="JLabelDemo" width=250 height=150>
 * 
 * </applet>
 * 
 */

public class JLabelDemo{
	
	
	ImageIcon icon = this.createImageIconData("image/springimage.jpg", "a pretty but meaningless picture");
	JLabel jl = new JLabel("Image and Text", icon, JLabel.CENTER);

	JLabelDemo() {
		
		//Create a new JFrame container
		JFrame jfrm = new JFrame("Paint Demo");
		jfrm.setSize(500, 500);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jfrm.add(jl);
		jfrm.setVisible(true);
	}
	
	protected ImageIcon createImageIconData(String path, String description) {
		URL imgURL = getClass().getResource(path);
		if(imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
	
	@SuppressWarnings("unused")
	private static void getImage() throws IOException {
		BufferedImage slate;
		slate = ImageIO.read(new File("images\\thumb.gif"));
		System.out.println(slate.getHeight());
	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override
			public void run() {
				new JLabelDemo();
			}
		});
	}
}
