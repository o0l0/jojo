package xyz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 		class Xygg extends JFrame implements ActionListener{
 			CardLayout xyg=new CardLayout();
 			JPanel p1=new JPanel();
			JPanel p2=new JPanel();
			JButton bt1,bt2;
 			public Xygg(){
			setSize(300,300);
			setVisible(true);
			this.addWindowListener(new WindowAdapter()
					{
				public void windowClosing(WindowEvent e) {
					Xygg.this.dispose();
					}
					}
					);
			p1.setLayout(xyg);
			p1.add(new Label("wdnmd",Label.CENTER));
			p1.add(new Label("123",Label.CENTER));
			p1.add(new Label("再来一瓶",Label.CENTER));
			bt1=new JButton("上一个");
			bt1.setFont(new Font("宋体",Font.PLAIN,20));
			bt2=new JButton("下一个");
			bt1.setFont(new Font("宋体",Font.PLAIN,30));
			bt1.addActionListener(this);
			bt2.addActionListener(this);
			p2.add(bt1);
			p2.add(bt2);
			this.add(p1,BorderLayout.CENTER);
			this.add(p2,BorderLayout.SOUTH);	
 			}
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==bt2)
					xyg.next(p1);
				if(e.getSource()==bt1)
					xyg.previous(p1);
			}
}

 		public class Xyy{
 		public static void main(String[] a) {
 			 Xygg x1=new Xygg();
 		}
 		}
 			
