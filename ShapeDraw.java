package com.brainmentors.gaming;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Shape;



public class ShapeDraw extends JFrame {

	public ShapeDraw()
	{
		setSize(new Dimension(320,320));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel p = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D obj = (Graphics2D)g;
				Shape rect = new Rectangle(50,50,100,100);
				Shape line = new Line2D.Double(4,4,150,150);
				Shape circle = new Ellipse2D.Double(150,150,150,150);
				
				obj.draw(rect);
				obj.draw(line);
				obj.draw(circle);
				
			}
		};
		
		setTitle("My Shape");
		this.getContentPane().add(p);
	}			
		
	public static void main(String arg[])
	{
		
		
				new ShapeDraw();
			}
			
				
		
		
		
	}
