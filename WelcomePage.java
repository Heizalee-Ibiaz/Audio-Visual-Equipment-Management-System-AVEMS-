package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame implements ActionListener {

	 class MenuPanel extends JPanel {

			Image kow;

	        MenuPanel() {
	            kow = new ImageIcon("Akaw.png").getImage();
	            this.setPreferredSize(new Dimension(1200, 700));
	        }

	        // Override paint method to draw an image
	        public void paint(Graphics g) {
	            Graphics2D g2d = (Graphics2D) g;
	            g2d.drawImage(kow, 0, 0, null);
	        }
	    }	
	JLabel labeltitle;
	JLabel sscrlabel;
	JLabel grouplabel;
	JLabel credits;
	JLabel svtlabel;
	
	JButton EnterButton;
	JButton ExitButton;
	JButton AboutButton;
	MenuPanel design;

	 
	public WelcomePage() {
		design = new MenuPanel();
		setTitle("Audio-Visual Equipment Management System");	
		ImageIcon icon = new ImageIcon("ico.png");
		
		labeltitle = new JLabel("Audio-Visual Equipment Management System");
		labeltitle.setBounds(69, 179, 1057, 88);
		labeltitle.setFont(new Font("Book Antiqua", Font.BOLD, 49));
		labeltitle.setForeground(new Color(255, 255, 255));
		add(labeltitle);
		
		grouplabel = new JLabel("by best group");
		grouplabel.setForeground(new Color(255, 255, 255));
		grouplabel.setFont(new Font("Segoe UI Emoji", Font.ITALIC, 14));
		grouplabel.setBounds(1032, 241, 189, 29);
		add(grouplabel);
		
		sscrlabel = new JLabel("San Sebastian College Recoletos de Cavite");
		sscrlabel.setBounds(139, 33, 777, 35);
		sscrlabel.setFont(new Font("Old English Text MT", Font.BOLD, 40));
		sscrlabel.setForeground(new Color(71, 43, 41));
		add(sscrlabel);
		
		svtlabel = new JLabel("St. Thomas of Villanova Library");
		svtlabel.setBounds(139, 65, 777, 35);
		svtlabel.setFont(new Font("Californian FB", Font.BOLD, 25));
		sscrlabel.setForeground(new Color(71, 43, 41));
		add(svtlabel);
			
		credits = new JLabel("© Group 1 BSCpE3 '23 -'24 (SSC-RdC) All Rights Reserved.");
		credits.setBackground(new Color(71, 43, 41));
		credits.setBounds(396, 608, 380, 29);
		add(credits);
		credits.setForeground(Color.white);
		credits.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
				
			//BUTTONS
		EnterButton = new JButton("Enter");
			EnterButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			EnterButton.setBounds(496, 276, 192, 48);
			EnterButton.addActionListener(this);
			EnterButton.setBackground(new Color(0xE1C03B));
			EnterButton.setBorderPainted(false);
			EnterButton.setFocusable(false);
			add(EnterButton);
		
		AboutButton = new JButton("About");
			AboutButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			AboutButton.setBounds(496, 346, 192, 48);
			AboutButton.addActionListener(this); 
			AboutButton.setBackground(new Color(0xE1C03B));
			AboutButton.setBorderPainted(false);
			AboutButton.setFocusable(false);
			add(AboutButton);
				
		ExitButton = new JButton("Exit");
			ExitButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			ExitButton.setBounds(496, 416, 192, 48);
			ExitButton.addActionListener(this);
			ExitButton.setBackground(new Color(0xE1C03B));
			ExitButton.setBorderPainted(false);
			ExitButton.setFocusable(false);
			add(ExitButton);
			
			
			add(design);
			pack();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setIconImage(icon.getImage());
			setSize(1215,725);
			setLayout(null);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
			
	}
	
	
		//ACTION PERFORMED OF EACH BUTTON
	public void actionPerformed(ActionEvent e) {
		
			//EXIT BUTTON ACTION
		if (e.getSource() == ExitButton) {
			int answer = JOptionPane.showOptionDialog(null, "Do you want to exit from AVEMS?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
				if(answer==0) {
					System.exit(0);
				}
				if(answer==1) {
					return;
				}
			}
		
			//ENTER BUTTON ACTION
		if (e.getSource() == EnterButton) {
			
        		MainPage mainframe = new MainPage();
        		mainframe.setVisible(true);
        		this.setVisible(false);	

			}
		
			//ABOUT BUTTON ACTION
		if (e.getSource() == AboutButton) {
			int answer = JOptionPane.showOptionDialog(null, "           The reservation system is a program that enables students, teachers and professors,\nand academic and non-academic organizations within San Sebastian College – Recoletos de Cavite\n          to book and reserve audio-visual (AV) equipment needed for a certain activity or event.", "About", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);

			}
	}
}
