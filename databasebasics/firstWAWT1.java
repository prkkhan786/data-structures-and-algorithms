package databasebasics;
import java.awt.*;

public class firstWAWT1 
{
	public firstWAWT1(){ 
		Frame f = new Frame();  // create frame //container
		Button b = new Button("click me "); // create button  // component
		b.setBounds(130,150,50,50); // left top width height
		f.add(b);
		f.setSize(300, 300);
		f.setLayout(null); // layout depends on cordinates given 
		f.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		firstWAWT1 f = new firstWAWT1();
	}

}
