package PJXT;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 class Zcjm extends JFrame implements ActionListener {
	 	JButton b1=new JButton("注册");
		JButton b2=new JButton("退出注册");
		JTextField x1=new JTextField();
		JTextField x2=new JPasswordField(8);
		JTextField x3=new JPasswordField(8);
		JFrame t=new JFrame("此处有监控");
		public Zcjm()
		{
	
			
			
			
			t.setSize(400,200);
			t.setLocationRelativeTo(null);//窗口居中
			t.setVisible(true);
			t.setLayout(new BorderLayout(5,5));
			t.add(new JLabel("  "),BorderLayout.EAST);
			t.add(new JLabel("  "),BorderLayout.WEST);
			t.add(new JLabel("  "),BorderLayout.NORTH);
			t.add(new JLabel("  "),BorderLayout.SOUTH);
			JPanel p1=new JPanel();
			
			JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/22.png"));
			y3.setSize(400,180);
			this.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
			y3.setBounds(0,0,400,180);
			Container contain=this.getContentPane();
			((JPanel)contain).setOpaque(false);
			t.add(y3);
			
			p1.setBackground(Color.CYAN);
			t.add(p1,BorderLayout.CENTER);
			p1.setLayout(new GridLayout(4,2,10,5));
			JLabel y1=new JLabel("                            账号");
			JLabel y2=new JLabel("                            密码");
			JLabel y4=new JLabel("                         确认密码");
			p1.add(y1);
			p1.add(x1);
			p1.add(y2);
			p1.add(x2);
			p1.add(y4);
			p1.add(x3);
			p1.add(b1);
			p1.add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);	
			
			

			b1.setBackground(Color.PINK);
			b2.setBackground(Color.PINK);
			p1.setBackground(Color.BLACK);
			
			class jtq implements ActionListener{
				public void actionPerformed(ActionEvent e) {//监听器
					t.dispose();
					new Dlck();
				}
			}
			ActionListener ls  =new jtq();
			b2.addActionListener(ls);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==b1)//当点击按键b1时
			{
				
				String b=x1.getText();String b1=x2.getText();
				if((x1.getText().length()!=0) && (x2.getText().length()!=0))
				{
					jmlj.insert(b,b1);
				JOptionPane.showMessageDialog(null, "注册成功");//跳出警告框
				new Dlck();t.dispose();
		
	
			}
				else JOptionPane.showMessageDialog(null, "账号已存在或账号密码不能为空或前后输入不一致");//跳出警告框
			
		}

		}
 }



