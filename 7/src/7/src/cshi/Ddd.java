package cshi;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame x=new JFrame();
		x.setSize(200,200);
		x.setVisible(true);
		JTextField x1=new JTextField(8);
		x.add(x1);
		String s=x1.getText().toString();
		System.out.println(s);
	}

}
