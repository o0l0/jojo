package Yhxt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ck extends JFrame {
	JTextField x1=new JTextField("",100);
	JButton b1=new JButton("存款");
	public Ck() {
		JFrame t=new JFrame("此处有监控");
		t.getContentPane().setBackground(Color.GREEN);
			t.setSize(400,200);
			t.setLocationRelativeTo(null);//窗口居中
			t.setVisible(true);
			JPanel p2=new JPanel();
			p2.setSize(200,50);
			t.add(p2,BorderLayout.CENTER);
			t.add(new Label("               "),BorderLayout.EAST);
			t.add(new Label("               "),BorderLayout.WEST);
			t.add(new Label("               "),BorderLayout.NORTH);
			t.add(new Label("               "),BorderLayout.SOUTH);
			p2.setLayout(new GridLayout(2,1,10,5));
			
			JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/1.jpg"));
			y3.setSize(800,800);
			t.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
			y3.setBounds(0,0,800,800);
			Container contain=t.getContentPane();
			((JPanel)contain).setOpaque(false);
			
			p2.add(x1);
			p2.add(b1);
			b1.setFont(new Font("华文彩云",Font.PLAIN,25));
			b1.setBackground(Color.orange);
			b1.setForeground(Color.RED);
			
			t.setBackground(Color.blue);
			
			class jtq implements ActionListener{
				public void actionPerformed(ActionEvent e) {//监听器
					int n=Integer.parseInt(x1.getText());
					if(n>=0 && x1.getText().length()!=0)
					{
					JOptionPane.showMessageDialog(null, "存入成功");//跳出警告框
					t.dispose();//退出上一个界面
					Dwj s=new Dwj();//读文件
					String z=null;
					try {
						z = s.Dwj("./src/Yhxt/qian.txt");
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					int p=Integer.parseInt(z);
					String a =""+(p+n);//int转String
					Xwj c=new Xwj();
					try {
						c.wj("./src/Yhxt/qian.txt",a);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
					else JOptionPane.showMessageDialog(null, "金额有误");//跳出警告框
				}
				}
			ActionListener ls  =new jtq();
			b1.addActionListener(ls);
			
	}

}

