package PJXT;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.*;

class Dlck extends JFrame implements ActionListener {

		JTextField x1=new JTextField("",8);
		JTextField x2=new JPasswordField(8);
		JButton b1=new JButton("注册");
		JButton b2=new JButton("登录");
		JFrame c=new JFrame("此处有监控");
	public Dlck(){
		
		
		c.setSize(400,180);
		c.setLocationRelativeTo(null);//窗口居中
			c.setVisible(true);
		
	JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/jgk.jpg"));
	y3.setSize(400,180);
	c.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
	y3.setBounds(0,0,400,180);
	Container contain=c.getContentPane();
	((JPanel)contain).setOpaque(false);
	//this.add(y3);
	c.setLayout(new BorderLayout(5,5));
	JLabel y1=new JLabel("        账号:");
	JLabel y2=new JLabel("        密码:");
	c.add(new JLabel("    "),BorderLayout.EAST);
	c.add(new JLabel("    "),BorderLayout.WEST);
	c.add(new JLabel("    "),BorderLayout.SOUTH);
	c.add(new JLabel("    "),BorderLayout.NORTH);
	JPanel p1=new JPanel();
	c.add(p1,BorderLayout.CENTER);
	p1.setLayout(new GridLayout(3,2,10,5));
	p1.add(y1);
	p1.add(x1);//String s=x1.getText().toString();
	p1.add(y2);
	p1.add(x2);//String s2=x2.getText().toString();
	p1.add(b1);
	p1.add(b2);
	//ActionListener lai =new Dlk();
	b1.addActionListener(this);        //函数在当前类中实现
	b2.addActionListener(this);
	y1.setFont(new Font("华文行楷",Font.PLAIN,23));
	y2.setFont(new Font("华文行楷",Font.PLAIN,23));
	x1.setFont(new Font("微软雅黑",Font.PLAIN,18));
	x2.setFont(new Font("微软雅黑",Font.PLAIN,18));
	b1.setFont(new Font("华文彩云",Font.PLAIN,23));
	b2.setFont(new Font("华文彩云",Font.PLAIN,23));
	b1.setForeground(Color.RED);
	b2.setForeground(Color.RED);
	b1.setBackground(Color.gray);
	b2.setBackground(Color.gray);
	p1.setBackground(Color.white);
	//System.out.println(s);
	//System.out.println(s2);
	}
	@SuppressWarnings("resource")
	public void actionPerformed(ActionEvent e) {
		//System.out.println(wj);
		//System.out.println(wj1);
		BufferedReader br=null;
		BufferedReader br1=null;
		String s = null,s1 = null;
		
	if(e.getSource()==b1)//当点击按键b1时
	{
		//System.exit(0);//退出图形界面
		c.dispose();//退出上一个界面
		new Zcjm();
	}
	if(e.getSource()==b2)//当点击按键b2时
	{
	String y=x1.getText().toString();String y1=x2.getText().toString();//获取文本框内容
	if(jmlj.select(y,y1))
			{
			JOptionPane.showMessageDialog(null, "登录成功");//跳出警告框
			//System.exit(0);//退出界面
			c.dispose();//退出上一个界面
			//setVisible(boolean);
			new Nrjm();
			//System.out.println(x1.getText());
			//System.out.println(x2.getText());
			}
	else {JOptionPane.showMessageDialog(null, "账号或密码错误");//跳出警告框
		//JOptionPane.showMessageDialog(null, ".....");//跳出警告框
//			System.out.println(x1.getText());
//			System.out.println(x2.getText());
//			System.out.println(s);
//			System.out.println(s1);
//	new Dey();
	}
	}
	}
}




