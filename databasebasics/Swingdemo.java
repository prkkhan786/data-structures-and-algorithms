package databasebasics;
import javax.swing.*;
public class Swingdemo extends JFrame {
	public Swingdemo() {
		JButton b = new JButton("click me");
		b.setBounds(50,50,100,100);
		add(b);
		setSize(500,500);
		setLayout(null); // layout depends on cordinates given 
		setTitle("parve");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		new Swingdemo();
	}
}
