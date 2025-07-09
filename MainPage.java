package FinalProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FinalProject.WelcomePage.MenuPanel;

public class MainPage extends JFrame implements ActionListener  {
	
	class MenuPanel extends JPanel {

		Image kow;

        MenuPanel() {
            kow = new ImageIcon("menu.png").getImage();
            this.setPreferredSize(new Dimension(1200, 700));
        }

        // Override paint method to draw an image
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(kow, 0, 0, null);
        }
    }

	JLabel titlelabel;
	JLabel sscrlabel;
	
	JButton ReserveButton;
	JButton ExitButton;
	JButton BorrowButton;
	JButton HelpButton;
	JButton ViewlistButton;
	MenuPanel design;
	
	public MainPage() {
		design = new MenuPanel();
		ImageIcon icon = new ImageIcon("ico.png");
		setTitle("Audio-Visual Equipment Management System");
				
		sscrlabel = new JLabel("San Sebastian College Recoletos de Cavite");
			sscrlabel.setBounds(130, 30, 641, 35);
			sscrlabel.setFont(new Font("Old English Text MT", Font.BOLD, 24));
			sscrlabel.setForeground(new Color(71, 43, 41));
				add(sscrlabel);
				
		titlelabel = new JLabel("Audio-Visual Equipment Management System");
			titlelabel.setBounds(127, 38, 1015, 88);
			titlelabel.setFont(new Font("Book Antiqua", Font.BOLD, 40));
			titlelabel.setForeground(new Color(71, 43, 41));
				add(titlelabel);
				
			//IMAGE USED
		ImageIcon Iconreserve = new ImageIcon("RESERVE2.png");
		ImageIcon Iconborrow = new ImageIcon("BORROW1.png");
		ImageIcon Iconview = new ImageIcon("VIEWLIST3.png");
		ImageIcon Iconhelp = new ImageIcon("HELP.png");
		ImageIcon Iconexit = new ImageIcon("EXIT.png");		
				
			//BUTTONS
			
		ReserveButton = new JButton();
			ReserveButton.setBounds(80, 180, 194, 210);
			ReserveButton.setOpaque(false);
			ReserveButton.setContentAreaFilled(false);
			ReserveButton.setBorderPainted(false);
			ReserveButton.setFocusable(false);	
			ReserveButton.setIcon(Iconreserve);
			add(ReserveButton);
				ReserveButton.addActionListener(this); 

			
		BorrowButton = new JButton();
			BorrowButton.setBounds(291, 180, 194, 210);
			BorrowButton.setFocusable(false);
			BorrowButton.setOpaque(false);
			BorrowButton.setContentAreaFilled(false);
			BorrowButton.setBorderPainted(false);
			BorrowButton.setIcon(Iconborrow);
			add(BorrowButton);
				BorrowButton.addActionListener(this);
			
		ViewlistButton = new JButton();
			ViewlistButton.setBounds(502, 180, 194, 210);
			ViewlistButton.setFocusable(false);
			ViewlistButton.setOpaque(false);
			ViewlistButton.setContentAreaFilled(false);
			ViewlistButton.setBorderPainted(false);
			ViewlistButton.setIcon(Iconview);
			add(ViewlistButton);
				ViewlistButton.addActionListener(this); 
			
		HelpButton = new JButton();
			HelpButton.setBounds(172, 402, 204, 210);
			HelpButton.setFocusable(false);
			HelpButton.setOpaque(false);
			HelpButton.setContentAreaFilled(false);
			HelpButton.setBorderPainted(false);
			HelpButton.setIcon(Iconhelp);
			add(HelpButton);
				HelpButton.addActionListener(this); 	
			
		ExitButton = new JButton();
			ExitButton.setBounds(389, 402, 204, 210);
			ExitButton.setFocusable(false);
			ExitButton.setOpaque(false);
			ExitButton.setContentAreaFilled(false);
			ExitButton.setBorderPainted(false);
			ExitButton.setIcon(Iconexit);
			add(ExitButton);
				ExitButton.addActionListener(this);	
				
		
				add(design);
				pack();
				setSize(1215,725);
				setIconImage(icon.getImage());
				setLayout(null);
				setResizable(false);
				setLocationRelativeTo(null);
				setVisible(true);
			
	}
	
	//ACTION PERFORMED OF EACH BUTTON
		public void actionPerformed(ActionEvent e) {
			
				//EXIT BUTTON ACTION
			if (e.getSource() == ExitButton) {
				int answer = JOptionPane.showOptionDialog(null, "Do you want to go to Main Menu?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
				if(answer==0) {
					dispose();
					new WelcomePage();
				}
				if(answer==1) {
					return;
				}
				}
			
			if (e.getSource() == ReserveButton) {
				dispose();
				new ReservePage1();
			}
			
			if (e.getSource() == BorrowButton) {
				
				BorrowPage borrowframe = new BorrowPage();
				borrowframe.setVisible(true);
        		this.setVisible(false);	

			}
				
			
			if (e.getSource() == ViewlistButton) {
				
	        		ViewlistPage viewlistframe = new ViewlistPage();
	        		viewlistframe.setVisible(true);
	        		this.setVisible(false);	

				}
			
			if (e.getSource() == HelpButton) {
				
        			HelpPage helpframe = new HelpPage();
        			helpframe.setVisible(true);
        			this.setVisible(false);	

			}
		}

}
