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

public class BorrowPage extends JFrame implements ActionListener  {

	JPanel mainpanel;
	JPanel subpanel1;
	JPanel tabpanel;
	JPanel panel1;

	JLabel titlelabel;
	JLabel sscrlabel;
	JLabel borrowlabel;
	JLabel grouplabel;
	
	JButton HomeButton;
	JButton NextButton;


	
	public BorrowPage() {
		
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
		tabpanel.setBounds(189, 155, 160, 48);
		tabpanel.setLayout(null);
			mainpanel.add(tabpanel);
		
	panel1 = new JPanel();
		panel1.setBackground(new Color(235, 235, 235));
		panel1.setBounds(59, 202, 1066, 420);
		panel1.setLayout(null);
			mainpanel.add(panel1);	
			
			
	JLabel fnamelabel = new JLabel("FIRST NAME:");
		fnamelabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		fnamelabel.setBounds(33, 25, 137, 25);
		panel1.add(fnamelabel);
		
	JLabel lnamelabel = new JLabel("LAST NAME:");
		lnamelabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		lnamelabel.setBounds(33, 75, 137, 25);
		panel1.add(lnamelabel);

	JLabel idlabel = new JLabel("I.D. NUMBER:");
		idlabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		idlabel.setBounds(33, 125, 137, 25);
		panel1.add(idlabel);
	
	JLabel progamlabel = new JLabel("PROGRAM:");
		progamlabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		progamlabel.setBounds(33, 175, 137, 25);
		panel1.add(progamlabel);

	JLabel yearlevellabel = new JLabel("YEAR LEVEL:");
		yearlevellabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		yearlevellabel.setBounds(33, 225, 137, 25);
		panel1.add(yearlevellabel);

	JLabel cpnumlabel = new JLabel("CELLPHONE NUMBER:");
		cpnumlabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 17));
		cpnumlabel.setBounds(33, 275, 211, 25);
		panel1.add(cpnumlabel);
		
	JTextField fnamefield = new JTextField();
		fnamefield.setBounds(292, 25, 299, 32);
		panel1.add(fnamefield);
		fnamefield.setColumns(10);
	
	JTextField lnamefield = new JTextField();
		lnamefield.setBounds(292, 75, 299, 32);
		panel1.add(lnamefield);
		lnamefield.setColumns(10);
	
	JTextField idnumfield = new JTextField();
		idnumfield.setBounds(292, 125, 299, 32);
		panel1.add(idnumfield);
		idnumfield.setColumns(10);
		
	JTextField programfield = new JTextField();
		programfield.setBounds(292, 175, 299, 32);
		panel1.add(programfield);
		programfield.setColumns(10);
		
	JTextField yearlevelfield = new JTextField();
		yearlevelfield.setBounds(292, 225, 299, 32);
		panel1.add(yearlevelfield);
		yearlevelfield.setColumns(10);
		
	JTextField cpnumfield = new JTextField();
		cpnumfield.setBounds(292, 275, 299, 32);
		panel1.add(cpnumfield);
		cpnumfield.setColumns(10);
		
					

			
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
		
		borrowlabel = new JLabel("Borrow");
			borrowlabel.setBounds(42, 10, 189, 29);
			borrowlabel.setForeground(new Color(71, 43, 41));
			borrowlabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
				tabpanel.add(borrowlabel);

				
				
		HomeButton = new JButton("Home");
			HomeButton.setBounds(59, 155, 130, 48);
			HomeButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
				mainpanel.add(HomeButton);
				HomeButton.addActionListener(this);
				
		NextButton = new JButton("NEXT");
			NextButton.setBounds(907, 349, 130, 48);
			NextButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
				panel1.add(NextButton);
				//NextButton.addActionListener(this);	

	}


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == HomeButton) {
			int answer = JOptionPane.showOptionDialog(null, "Do you want to return to Home Page?", "Home", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
			
			if(answer==0) {
				MainPage mainframe = new MainPage();
	    		mainframe.setVisible(true);
	    		this.setVisible(false);				}
			
			if(answer==1) {
				return;
			}
		}
			
			
    		



}
}
