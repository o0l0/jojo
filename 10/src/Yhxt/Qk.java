package Yhxt;
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
	import java.awt.Label;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class Qk  extends JFrame {
		JTextField x1=new JTextField("",100);
		JButton b1=new JButton("取款");
		public Qk() {
			JFrame t=new JFrame("此处有监控");
			t.getContentPane().setBackground(Color.yellow);
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
				
			/*	Dwj s=new Dwj();//读文件
				
				try {
					s.Dwj(".src/Yhxt/Qian.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				
				p2.add(x1);
				p2.add(b1);
				b1.setFont(new Font("华文彩云",Font.PLAIN,25));
				b1.setBackground(Color.pink);
				b1.setForeground(Color.blue);
				
				
				
				class jtq implements ActionListener{
					public void actionPerformed(ActionEvent e) {//监听器
						int n=Integer.parseInt(x1.getText());//String转int
						
						Dwj s=new Dwj();//读文件
								String z=null;
								try {
									z = s.Dwj("./src/Yhxt/qian.txt");
								} catch (IOException e2) {
									// TODO Auto-generated catch block
									e2.printStackTrace();
								}
							int p=Integer.parseInt(z);
						if(p>=n)
						{
						JOptionPane.showMessageDialog(null, "取款成功");//跳出警告框
						Xwj c=new Xwj();//写文件
						t.dispose();//退出上一个界面t
						String a =""+(p-n);//int转String
						try {
							c.wj("./src/Yhxt/qian.txt",a);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						}
						else JOptionPane.showMessageDialog(null, "余额不足");//跳出警告框
					}
					}
				ActionListener ls  =new jtq();
				b1.addActionListener(ls);
				
		}

	}


