package cshi;
import java.awt.*;
import javax.swing.*;
		class An extends JFrame {
		public An(String a) {
			//ÉÏÏÂ×óÓÒÖĞ
		this.setLayout(new BorderLayout(5,5));
		/*Button a1=new Button();
		Button a2=new Button();
		Button a3=new Button();
		Button a4=new Button();
		Button a5=new Button();*/
/*ÓÃ»§ÃûÃÜÂë00	this.add(new JLabel("    "),BorderLayout.EAST);
		this.add(new JLabel("    "),BorderLayout.WEST);
		this.add(new JLabel("    "),BorderLayout.SOUTH);
		this.add(new JLabel("    "),BorderLayout.NORTH);
		JPanel p1=new JPanel();
	this.add(p1,BorderLayout.CENTER);
		p1.setLayout(new GridLayout(3,2,10,5));
		p1.add(new JLabel("ÕËºÅ"));
		p1.add(new TextField(8));
		p1.add(new JLabel("ÃÜÂë"));
		p1.add(new TextField("ÇëÊäÈëÃÜÂë",8));
		p1.add(new JButton("×¢²á"));
		p1.add(new JButton("µÇÂ¼"));*/
		//¼ÆËã»ú
		//this.add(new JLabel("    "),BorderLayout.EAST);
		//this.add(new JLabel("    "),BorderLayout.WEST);
		//this.add(new JLabel(""),BorderLayout.SOUTH);
		this.add(new TextField(4),BorderLayout.NORTH);
		this.setForeground(Color.red);
		JPanel p1=new JPanel();
		this.add(p1,BorderLayout.CENTER);
		p1.setBackground(Color.yellow);//±³¾°ÑÕÉ«
		p1.setLayout(new GridLayout(5,4));
		p1.add(new JButton("Çå¿Õ"));
		p1.add(new JButton("É¾³ı"));
		p1.add(new JButton("ÓïÒô"));
		p1.add(new JButton("Ê±¼ä"));
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
		//Íø¸ñ2
			/*this.setLayout(new GridLayout(3,2,4,4));
			this.add(new JButton("ÕËºÅ"));
			this.add(new TextField(8));
			this.add(new JButton("ÃÜÂë"));
			this.add(new PasswordField("ÇëÊäÈëÃÜÂë",8));
			this.add(new JButton("×¢²á"));
			this.add(new JButton("µÇÂ¼"));*/
		}
		}

