package Yhxt;

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

	public class Xgmm  extends JFrame implements ActionListener {
		 	JButton b1=new JButton("修改");
			JButton b2=new JButton("不改了");
			JTextField x1=new JPasswordField(8);
			JTextField x2=new JPasswordField(8);
			JTextField x3=new JPasswordField(8);
			JFrame t=new JFrame("此处有监控");
			public Xgmm()
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
				
				JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java！/7/src/11/src/50.jpg"));
				y3.setSize(400,180);
				this.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
				y3.setBounds(0,0,400,180);
				Container contain=this.getContentPane();
				((JPanel)contain).setOpaque(false);
				t.add(y3);
				
				p1.setBackground(Color.CYAN);
				t.add(p1,BorderLayout.CENTER);
				p1.setLayout(new GridLayout(4,2,10,5));
				JLabel y1=new JLabel("                           原密码");
				JLabel y2=new JLabel("                           新密码");
				JLabel y4=new JLabel("                        确认新密码");
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
				
				

				b1.setBackground(Color.yellow);
				b2.setBackground(Color.yellow);
				p1.setBackground(Color.blue);
				
				class jtq implements ActionListener{
					public void actionPerformed(ActionEvent e) {//退出监听器
						t.dispose();
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
			/*		if((x1.getText().equals(null)) && (x2.getText().equals(null)))
					{
						JOptionPane.showMessageDialog(null, "前后输入不一致");
					}*/
					Dwj s=new Dwj();//读文件
					String z=null;
					try {
						z = s.Dwj("C:\\\\Users\\\\Administrator\\\\Desktop\\\\java！\\\\7\\\\src\\\\11\\\\src\\\\wj1.txt");
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					if((x1.getText().equals(z)) && (x2.getText().length()!=0) && (x2.getText().equals(x3.getText())))
					{
						String b1=x2.getText();
					JOptionPane.showMessageDialog(null, "修改成功");//跳出警告框
					t.dispose();
					Xwj x1=new Xwj();
			
					try {
						x1.wj("C:\\Users\\Administrator\\Desktop\\java！\\7\\src\\11\\src\\wj1.txt",b1);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		
				
		
				}
					else JOptionPane.showMessageDialog(null, "密码不能为空或前后输入不一致");//跳出警告框
				
			}

				

			}
	 }


