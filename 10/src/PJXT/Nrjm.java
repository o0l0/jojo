package PJXT;





import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Nrjm extends JFrame{
	JButton z4=new JButton("   ����      ");
	JButton x=new JButton("   �˳�     ");
	JButton z2=new JButton("�޸�����");
	JButton z5=new JButton("   ����      ");
	public Nrjm()
	{
		
		
		JFrame t=new JFrame("�˴��м��");
		t.setSize(800,600);
		t.setLocationRelativeTo(null);//���ھ���
		t.setVisible(true);
		

		
		t.setLayout(new BorderLayout(10,10));
		

		t.add(new JLabel("    "),BorderLayout.EAST);
		t.add(new JLabel("    "),BorderLayout.WEST);
		
		JPanel p2=new JPanel();
		t.add(p2,BorderLayout.CENTER);
		JLabel y3=new JLabel(new ImageIcon("C:/Users/Administrator/Desktop/java��/7/src/11/src/60.jpg"));
		y3.setSize(800,800);
		t.getLayeredPane().add(y3,new Integer(Integer.MIN_VALUE));
		y3.setBounds(0,0,800,800);
		Container contain=t.getContentPane();
		((JPanel)contain).setOpaque(false);
		p2.add(y3);
		JPanel p3=new JPanel();
		t.add(p3,BorderLayout.SOUTH);
		JPanel p1=new JPanel();
		
		JMenuBar j=new JMenuBar();
		j.setSize(100,100);
		t.add(p1,BorderLayout.NORTH);
		j.setLayout(new GridLayout(1,1,10,5));
		p1.add(j);
		
		JMenu z1=new JMenu("--�ͷ�--");
		
		
		
		z1.setFont(new Font("�����п�",Font.PLAIN,23));
		z2.setFont(new Font("�����п�",Font.PLAIN,23));
     	z5.setFont(new Font("�����п�",Font.PLAIN,23));	
		p1.add(z4);p1.add(z5);p1.add(z2);p1.add(x);
		
		class jtq3 implements ActionListener{                                 //������Ҫ�����������ʹ��
			public void actionPerformed(ActionEvent e) {//���ۼ�����
				new Pljm();
			}
		}
		ActionListener ls1  =new jtq3();
		z4.addActionListener(ls1);
		
		class jtq333 implements ActionListener{                                
			public void actionPerformed(ActionEvent e) {//���ּ�����
				new Pfjm();
			}
		}
		ActionListener ls133  =new jtq333();
		z5.addActionListener(ls133);
		
		class jtq4 implements ActionListener{
			public void actionPerformed(ActionEvent e) {//�޸����������
				new Xgmm();
			}
		}
		ActionListener ls13  =new jtq4();
		z2.addActionListener(ls13);

		JRadioButton j1=new JRadioButton();
		JRadioButton j2=new JRadioButton();
		JRadioButton j3=new JRadioButton();
		JRadioButton j4=new JRadioButton();
		JRadioButton j5=new JRadioButton();
		JRadioButton j6=new JRadioButton();
		JRadioButton j7=new JRadioButton();
		p3.add(j1);p3.add(j2);p3.add(j3);p3.add(j4);p3.add(j5);p3.add(j6);p3.add(j7);//�����СԲ��
		
	class jtq implements ActionListener{
		public void actionPerformed(ActionEvent e) {//�˳�������
			System.exit(0);
		}
	}
	ActionListener ls  =new jtq();
	x.addActionListener(ls);
	
	
		j.add(z1);
		

		p1.setBackground(Color.YELLOW);
		j.setBackground(Color.PINK);
		JButton k1=new JButton("���ܿͷ�");
		JButton k2=new JButton("�˹�����");

		
		class jtq143 implements ActionListener{
			public void actionPerformed(ActionEvent e) {//������������
			new Xjj();
			}
		}
		ActionListener ls1212  =new jtq143();
		k2.addActionListener(ls1212);
		class jtq14 implements ActionListener{
			public void actionPerformed(ActionEvent e) {//����Ԫ������
			new Pljm2();
			}
		}
		ActionListener ls121  =new jtq14();
		k1.addActionListener(ls121);
		
	
		
		
		k1.setFont(new Font("��������",Font.PLAIN,18));
		k2.setFont(new Font("��������",Font.PLAIN,18));
		k1.setBackground(Color.GREEN);
		k2.setBackground(Color.GREEN);

		x.setBackground(Color.white);
		x.setFont(new Font("��������",Font.PLAIN,18));
		z4.setBackground(Color.white);
		z4.setFont(new Font("��������",Font.PLAIN,18));
		z2.setBackground(Color.white);
		z2.setFont(new Font("��������",Font.PLAIN,18));
		z5.setBackground(Color.white);
		z5.setFont(new Font("��������",Font.PLAIN,18));
		z1.add(k1);z1.add(k2);
			}
	
	/*public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==z5)//���������xʱ
			{
				
				new Pfjm();
				//System.exit(0);//�˳�����
				
			}
			}*/
		
		



}

