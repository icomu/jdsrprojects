package Cool;

import javax.swing.JFrame;

public class Fenster extends JFrame {
	
        public Fenster(){
        	JFrame Spiel=new JFrame();
		
		Spiel.setSize(1200,800);
		Spiel.setLocation(10, 10);
		Spiel.setResizable(false);
		Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiel.add(new Button());
		Spiel.setVisible(true);
				
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenster f = new Fenster();
	}}
	 