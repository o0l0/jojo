package cshi;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Bj2 extends JPanel{ 
	protected void paintComponent(Graphics g)
	{//��дpaintComponent������ʵ��jPanel�ӱ���   
		super.paintComponent(g);                           
		ImageIcon image=new ImageIcon(getClass().getResource(".jpg"));        //��ȡͼ��   
		image.setImage(image.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_FAST));
		//����ͼ��ķֱ�������Ӧ����            
		image.paintIcon(this, g,0, 0);    }          



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
