package FinalProject;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JTabbedPane;

public class ReservePage1 extends JFrame implements ActionListener  {

	class MenuPanel extends JPanel {

		Image kow;

        MenuPanel() {
            kow = new ImageIcon("bg.png").getImage();
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
	JButton exit;
	JTabbedPane tabbedPane;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	
	MenuPanel design;
	
	public ReservePage1() {
		design = new MenuPanel();
		ImageIcon icon = new ImageIcon("ico.png");
		setTitle("Audio-Visual Equipment Management System");
		Color bgColor = new Color(255, 255, 255, 128);
		
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
				
				tabbedPane = new JTabbedPane();
		        panel1 = new JPanel();
		        panel2 = new JPanel();
		        panel3 = new JPanel();
		        panel4 = new JPanel();
		       
		        tabbedPane.addTab("Personal Information", panel1);
		        tabbedPane.addTab("Item to Borrow", panel2);
		        tabbedPane.addTab("Confirm Changes", panel3);
		        tabbedPane.addTab("Enter Password", panel4);
		        tabbedPane.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		        tabbedPane.setBackground(bgColor);
		        tabbedPane.setBounds(50, 150, 1100, 400);
		        
		        add(tabbedPane);
		        
		exit = new JButton("Exit");
			exit.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
			exit.setBounds(1106, 636, 72, 40);
			exit.addActionListener(this);
			exit.setBackground(new Color(0xE1C03B));
			exit.setBorderPainted(false);
			exit.setFocusable(false);
				add(exit);
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

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==exit) {
			int answer = JOptionPane.showOptionDialog(null, "Do you want to cancel the reservation?", 
															"Exit",
															JOptionPane.OK_CANCEL_OPTION, 
															JOptionPane.QUESTION_MESSAGE, null, null, 0);
			if (answer == 0) {
				dispose();
				new MainPage();
			}
		}
	}
}
