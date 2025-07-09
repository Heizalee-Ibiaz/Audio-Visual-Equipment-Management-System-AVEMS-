package FinalProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class ViewlistPage extends JFrame implements ActionListener  {

	JPanel mainpanel;
	JPanel subpanel1;
	JPanel tabpanel;
	JScrollPane panel1;

	JLabel titlelabel;
	JLabel sscrlabel;
	JLabel viewlistlabel;
	JLabel grouplabel;
	
	JButton HomeButton;

	
	public ViewlistPage() {

		setTitle("Audio-Visual Equipment Management System");
		
	mainpanel = new JPanel();
		mainpanel.setBackground(new Color(181, 11, 23));
		mainpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainpanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 1200, 700);
			mainpanel.setLayout(null);
					
	subpanel1 = new JPanel();
		subpanel1.setBackground(new Color(245, 218, 20));
		subpanel1.setBounds(0, 0, 1186, 118);
		subpanel1.setLayout(null);
			mainpanel.add(subpanel1);
			
	tabpanel = new JPanel();
		tabpanel.setBackground(new Color(235, 235, 235));
		tabpanel.setBounds(189, 155, 133, 48);
		tabpanel.setLayout(null);
			mainpanel.add(tabpanel);
		
	panel1 = new JScrollPane();
		panel1.setBackground(new Color(235, 235, 235));
		panel1.setBounds(59, 202, 1066, 420);
		panel1.setLayout(null);
			mainpanel.add(panel1);	

			
		sscrlabel = new JLabel("San Sebastian College Recoletos de Cavite");
			sscrlabel.setBounds(33, 10, 641, 35);
			sscrlabel.setFont(new Font("Old English Text MT", Font.BOLD, 24));
			sscrlabel.setForeground(new Color(71, 43, 41));
				subpanel1.add(sscrlabel);
				
		titlelabel = new JLabel("Audio-Visual Equipment Management System");
			titlelabel.setBounds(33, 20, 1015, 88);
			titlelabel.setFont(new Font("Book Antiqua", Font.BOLD, 47));
			titlelabel.setForeground(new Color(71, 43, 41));
				subpanel1.add(titlelabel);
			
		grouplabel = new JLabel("by best group");
			grouplabel.setBounds(961, 79, 189, 29);
			grouplabel.setForeground(new Color(71, 43, 41));
			grouplabel.setFont(new Font("Segoe UI Emoji", Font.ITALIC, 14));
				subpanel1.add(grouplabel);
		
		viewlistlabel = new JLabel("View List");
			viewlistlabel.setBounds(25, 10, 189, 29);
			viewlistlabel.setForeground(new Color(71, 43, 41));
			viewlistlabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
				tabpanel.add(viewlistlabel);

				
		HomeButton = new JButton("Home");
			HomeButton.setBounds(59, 155, 130, 48);
			HomeButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
			HomeButton.addActionListener(this);
				mainpanel.add(HomeButton);

	}


	public void actionPerformed(ActionEvent e) {
		
	if (e.getSource() == HomeButton) {
		
    		MainPage mainframe = new MainPage();
    		mainframe.setVisible(true);
    		this.setVisible(false);	

		}
}
}
