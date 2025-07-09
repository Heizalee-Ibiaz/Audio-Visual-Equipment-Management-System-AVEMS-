package FinalProject;

import java.awt.EventQueue;

//MAIN CLASS - RUNS THE PROGRAM

public class Main {

	public static void main(String[] args) {
 			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					WelcomePage welcomframe = new WelcomePage();
					welcomframe.setVisible(true);

				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}