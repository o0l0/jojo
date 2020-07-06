package xyz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class Xyg extends JFrame{
		public Xyg(){
		JButton b1=new JButton("打开计算器");
		this.add(b1);
		ActionListener lai =new wdnmd();
		b1.addActionListener(lai);
		}
		class wdnmd implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ".....");//跳出警告框
				JFrame f2 =new JFrame("计算器");
				f2.setSize(320,450);
				f2.setVisible(true);
				f2.setLayout(new BorderLayout(5,5));
				f2.add(new TextField(4),BorderLayout.NORTH);
				f2.setForeground(Color.red);
				JPanel p1=new JPanel();
				f2.add(p1,BorderLayout.CENTER);
				p1.setBackground(Color.yellow);//背景颜色
				p1.setLayout(new GridLayout(5,4));
				p1.add(new JButton("清空"));
				p1.add(new JButton("删除"));
				p1.add(new JButton("语音"));
				p1.add(new JButton("时间"));
				p1.add(new JButton("1"));
				p1.add(new JButton("2"));
				p1.add(new JButton("3"));
				p1.add(new JButton("+"));
				p1.add(new JButton("4"));
				p1.add(new JButton("5"));
				p1.add(new JButton("6"));
				p1.add(new JButton("-"));
				p1.add(new JButton("7"));
				p1.add(new JButton("8"));
				p1.add(new JButton("9"));
				p1.add(new JButton("*"));
				p1.add(new JButton("%"));
				p1.add(new JButton("0"));
				p1.add(new JButton("#"));
				p1.add(new JButton("^"));
			}
		}
	public static void main(String[] args){
	// TODO Auto-generated method stub
	 Xyg x1 =new Xyg();
	x1.setTitle("第一个");
	x1.setSize(300,300);
	x1.setVisible(true);
	}
}