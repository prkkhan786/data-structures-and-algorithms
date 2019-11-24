package databasebasics;
import javax.swing.*;
import java.awt.event.*;
public class EventListnerdemo {
	public EventListnerdemo() {
		
	}
	
	public static void main(String[] args) {
		JFrame l = new JFrame("button example");
		final JTextField t = new JTextField();
		JButton b = new JButton("click");
		t.setBounds(150, 150, 150, 20);
		b.setBounds(200,180,80,80);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t.setText("welcome to our are");	
			}
		});
		l.add(b);
		l.add(t);
		l.setLayout(null);	
		l.setSize(400, 400);
		l.setVisible(true);
	}	
}
