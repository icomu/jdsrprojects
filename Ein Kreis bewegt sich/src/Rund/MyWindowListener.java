package Rund;
import java.awt.event.*;

public class MyWindowListener extends WindowAdapter{

	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}