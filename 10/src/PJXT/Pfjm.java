package PJXT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pfjm  extends JFrame {
	 JTextArea b1; JTextArea b2;
	 JScrollPane p3;JScrollPane p2;
	JButton b3=new JButton("商品评分提交");
	JButton b4=new JButton("物流评分提交");
	JTextField x1=new JTextField(1);
	JTextField x2=new JTextField(1);
	public  Pfjm(){
		
	JFrame f= new JFrame("评分10分置顶！！！");
	
	JPanel p1=new JPanel();
	p1.setSize(300,250);
	f.add(p1,BorderLayout.CENTER);
	f.add(new Label("           "),BorderLayout.EAST);
	f.add(new Label("           "),BorderLayout.WEST);
	f.add(new Label("           "),BorderLayout.NORTH);
	f.add(new Label("           "),BorderLayout.SOUTH);
	p1.setLayout(new GridLayout(3,2,10,5));
	p1.setLocation(500,250);
	b1=new JTextArea(3,2);b2=new JTextArea(3,2);
	p3=new JScrollPane(b1);
	p2=new JScrollPane(b2);
	  b1.setEditable(false);  b2.setEditable(false);
	p1.add(p3);p1.add(p2);p1.add(x1);p1.add(x2);p1.add(b3);p1.add(b4);
	f.setSize(400,220);
	f.setLocationRelativeTo(null);//窗口居中
	f.setVisible(true);
		class jtq3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {//评论监听器
			b1.append("商品评分："+x1.getText());
			
		}
	}
	ActionListener ls1  =new jtq3();
	b3.addActionListener(ls1);
	
	class jtq31 implements ActionListener{
		public void actionPerformed(ActionEvent e) {//评论监听器
			b2.append("物流评分："+x1.getText());
		}
	}
	ActionListener ls11  =new jtq31();
	b4.addActionListener(ls11);
	
	
	
	
	
}
/*	public static void main(String[] args) {
		Pfjm t=new Pfjm();
	}
	*/
	
	

}
