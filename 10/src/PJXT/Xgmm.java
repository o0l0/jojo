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

	public class Xgmm  extends JFrame implements ActionListener {
		 	JButton b1=new JButton("�޸�");
			JButton b2=new JButton("������");
			JTextField x4=new JPasswordField(8);
			JTextField x1=new JPasswordField(8);
			JTextField x2=new JPasswordField(8);
			JTextField x3=new JPasswordField(8);
			JFrame t=new JFrame("�˴��м��");
			public Xgmm()
			{
		
				
				
				
				t.setSize(400,200);
				t.setLocationRelativeTo(null);//���ھ���
				t.setVisible(true);
				t.setLayout(new BorderLayout(5,5));
				t.add(new JLabel("  "),BorderLayout.EAST);
				t.add(new JLabel("  "),BorderLayout.WEST);
				t.add(new JLabel("  "),BorderLayout.NORTH);
				t.add(new JLabel("  "),BorderLayout.SOUTH);
				JPanel p1=new JPanel();
				
				JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java��/7/src/11/src/50.jpg"));
				y3.setSize(400,180);
				this.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
				y3.setBounds(0,0,400,180);
				Container contain=this.getContentPane();
				((JPanel)contain).setOpaque(false);
				t.add(y3);
				
				p1.setBackground(Color.CYAN);
				t.add(p1,BorderLayout.CENTER);
				p1.setLayout(new GridLayout(5,2,10,5));
				JLabel y5=new JLabel("                            �˺�");
				JLabel y1=new JLabel("                           ԭ����");
				JLabel y2=new JLabel("                           ������");
				JLabel y4=new JLabel("                        ȷ��������");
				p1.add(y5);
				p1.add(x4);
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
				p1.setBackground(Color.gray);
				
				class jtq implements ActionListener{
					public void actionPerformed(ActionEvent e) {//�˳�������
						t.dispose();
					}
				}
				ActionListener ls  =new jtq();
				b2.addActionListener(ls);

			}
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==b1)//���������b1ʱ
				{
					if((x2.getText().length()!=0) && (x2.getText().equals(x3.getText())))
					{
						String b1=x2.getText();String b2=x4.getText();String b3=x1.getText();
						if(jmlj.select(b2,b3)){
						jmlj.insert2(b2,b1);
					//JOptionPane.showMessageDialog(null, "�޸ĳɹ�");//���������
					t.dispose();
						}else JOptionPane.showMessageDialog(null, "�˺Ų�����");//���������
			
		
				
		
				}
					else JOptionPane.showMessageDialog(null, "���벻��Ϊ�ջ�ǰ�����벻һ��");//���������
				
			}

				

			}
	 }



