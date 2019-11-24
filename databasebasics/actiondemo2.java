package databasebasics;
import javax.swing.*;
import java.awt.event.*;

public class actiondemo2 implements ActionListener{
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	public static void main(String[] args) {
		new actiondemo2();

	}
	public actiondemo2() {
		JFrame f = new JFrame("calculator");
		t1= new JTextField(); t1.setBounds(50,100, 100, 30);
		t2= new JTextField();	 t2.setBounds(50,150, 100,30);
		t3= new JTextField();	t3.setBounds(50,200, 100, 30);
		b1= new JButton("ADD");	b1.setBounds(150,150,100,90);
		b2 = new JButton("sub");b2.setBounds(250,180,100,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);	
		t3.setEditable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		String s2 = t2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
			if(e.getSource()==b1){
				c=a+b;
			}else if(e.getSource()==b2){
				c=a-b;
			}
			String ans = String.valueOf(c);
			t3.setText(ans);
	}

}
