package cshi;

import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;

public class Bj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Container ct;
	public void Bjtp()
	{
		ct=this.getContentPane();
		this.setLayout(null);
		BackgroundPanel bj=new BackgroundPanel((new ImageIcon("D:jgk.jpg")).getImage());
		((Component) bj).setBounds(0,0,400,180);
		ct.add((Component) bj);
	}
	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}
	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

}
