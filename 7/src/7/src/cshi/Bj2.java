package cshi;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Bj2 extends JPanel{ 
	protected void paintComponent(Graphics g)
	{//重写paintComponent方法以实现jPanel加背景   
		super.paintComponent(g);                           
		ImageIcon image=new ImageIcon(getClass().getResource(".jpg"));        //获取图像   
		image.setImage(image.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_FAST));
		//调整图像的分辨率以适应容器            
		image.paintIcon(this, g,0, 0);    }          



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
