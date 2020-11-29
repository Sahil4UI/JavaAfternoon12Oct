package com.brainmentors.gaming;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application extends JFrame implements GameConstant{
	public Application()
	{
		initUI();
	}
	private void initUI()
	{
		add(new Board());
		setSize(GWIDTH,GHEIGHT);
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			Application ex = new Application();
			ex.setVisible(true);
		});
	}
}
