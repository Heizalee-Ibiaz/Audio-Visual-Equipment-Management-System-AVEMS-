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
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

public class HelpPage extends JFrame implements ActionListener  {

	JPanel mainpanel;
	JPanel subpanel1;
	JPanel tabpanel;
	JPanel panel1;

	JLabel titlelabel;
	JLabel sscrlabel;
	JLabel helplabel;
	JLabel grouplabel;
	
	JButton HomeButton;
	private JLabel faqslabel;
	private JLabel howtoreservelabel;
	private JLabel howtoborrowlabel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;

	
	public HelpPage() {
		
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
		tabpanel.setBounds(59, 155, 133, 48);
		tabpanel.setLayout(null);
			mainpanel.add(tabpanel);
		
	panel1 = new JPanel();
		panel1.setBackground(new Color(235, 235, 235));
		panel1.setBounds(59, 202, 1066, 420);
		panel1.setLayout(null);
			mainpanel.add(panel1);
			
			faqslabel = new JLabel("How to Return?");
			faqslabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
			faqslabel.setBounds(25, 241, 182, 35);
			panel1.add(faqslabel);
			
			howtoreservelabel = new JLabel("How to Reserve?");
			howtoreservelabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
			howtoreservelabel.setBounds(25, 24, 267, 35);
			panel1.add(howtoreservelabel);
			
			howtoborrowlabel = new JLabel("How to Borrow?");
			howtoborrowlabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
			howtoborrowlabel.setBounds(502, 17, 206, 49);
			panel1.add(howtoborrowlabel);
			
			JLabel lblNewLabel = new JLabel("- Click Reserve Button");
			lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel.setBounds(55, 59, 230, 20);
			panel1.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("- Fill-up the digital form");
			lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(55, 89, 176, 20);
			panel1.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("- Review Terms and Conditions");
			lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(55, 119, 230, 20);
			panel1.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("- Submit Authorization of Program Chair to the Facilitator\r\n");
			lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(55, 149, 417, 25);
			panel1.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("- Facilitator confirms reservation");
			lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(55, 187, 406, 13);
			panel1.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("- Click Borrow Button");
			lblNewLabel_5.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_5.setBounds(539, 63, 351, 13);
			panel1.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("- Fill-up the digital form");
			lblNewLabel_6.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_6.setBounds(539, 89, 295, 20);
			panel1.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("- Review Terms and Conditions");
			lblNewLabel_7.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_7.setBounds(539, 123, 267, 13);
			panel1.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel("- Submit Authorization of Program Chair to the Facilitator");
			lblNewLabel_8.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_8.setBounds(539, 151, 436, 20);
			panel1.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("- Facilitator confirms borrow request");
			lblNewLabel_9.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_9.setBounds(539, 183, 411, 20);
			panel1.add(lblNewLabel_9);
			
			JLabel lblNewLabel_10 = new JLabel("- Claim the reserved equipment on the scheduled date");
			lblNewLabel_10.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_10.setBounds(55, 210, 447, 21);
			panel1.add(lblNewLabel_10);
			
			JLabel lblNewLabel_11 = new JLabel("- Claim the borrowed equipment");
			lblNewLabel_11.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_11.setBounds(539, 214, 493, 13);
			panel1.add(lblNewLabel_11);
			
			lblNewLabel_12 = new JLabel("- Approach the Facilitator");
			lblNewLabel_12.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			lblNewLabel_12.setBounds(55, 275, 406, 20);
			panel1.add(lblNewLabel_12);
			
									
					HomeButton = new JButton("Home");
					HomeButton.setBounds(926, 362, 130, 48);
					panel1.add(HomeButton);
					HomeButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
					
					lblNewLabel_13 = new JLabel("- Return the equipment");
					lblNewLabel_13.setFont(new Font("Century Gothic", Font.PLAIN, 15));
					lblNewLabel_13.setBounds(55, 305, 406, 20);
					panel1.add(lblNewLabel_13);
					
					lblNewLabel_14 = new JLabel("- Facilitator confirms the returned equipment");
					lblNewLabel_14.setFont(new Font("Century Gothic", Font.PLAIN, 15));
					lblNewLabel_14.setBounds(55, 335, 406, 13);
					panel1.add(lblNewLabel_14);
					HomeButton.addActionListener(this);

			
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
		
		helplabel = new JLabel("Help");
			helplabel.setBounds(42, 10, 189, 29);
			helplabel.setForeground(new Color(71, 43, 41));
			helplabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
				tabpanel.add(helplabel);

	}


	public void actionPerformed(ActionEvent e) {
		
	if (e.getSource() == HomeButton) {
		
    		MainPage mainframe = new MainPage();
    		mainframe.setVisible(true);
    		this.setVisible(false);	

		}
}
}
