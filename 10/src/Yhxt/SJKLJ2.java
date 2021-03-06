package Yhxt;



import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.util.*;  
import java.io.*;  
import java.sql.*;  
/** 
 *作者：rong 
 * 功能：与数据库中的用户数据进行匹配 匹配成功的话显示成功对话框。 
 * 2016-7-17 
 */  
public class SJKLJ2  
{  
  
    // 登录界面的GUI组件  
    private JFrame jf = new JFrame("登录");  
    private JPanel jp1=new JPanel();  
    private JPanel jp2=new JPanel();  
    private JPanel jp3=new JPanel();  
    private JButton jb1=new JButton("注册");  
    private JTextField userField = new JTextField(20);  
    private JTextField passField = new JTextField(20);  
    private JButton loginButton = new JButton("登录");  
    public void init()throws Exception  
    {  
          
        // 加载驱动  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        // 为登录按钮添加事件监听器  
        loginButton.addActionListener(e -> {  
            // 登录成功则显示“登录成功”  
            System.out.println(userField.getText() +"\t"+passField.getText()+"\t"+validate(userField.getText(), passField.getText()));  
            if (validate(userField.getText(), passField.getText()))  
            {  
                JOptionPane.showMessageDialog(jf, "登录成功");  
            }  
            // 否则显示“登录失败”  
            else  
            {  
                JOptionPane.showMessageDialog(jf, "登录失败");  
            }  
        });  
        jb1.addActionListener(e -> {  
            // 登录成功则显示“登录成功”  
            System.out.println(userField.getText() +"\t"+passField.getText()+"\t"+validate(userField.getText(), passField.getText()));  
            try {  
                cheak(userField.getText(),passField.getText());  
                  
              
                  
            } catch (Exception e1) {  
                // TODO Auto-generated catch block  
                e1.printStackTrace();  
            }  
        });  
        class mylister extends WindowAdapter{  
  
            @Override  
            public void windowClosing(WindowEvent e) {  
                  
                System.exit(0);  
            }  
              
        }  
        jf.addWindowListener(new mylister());  
        jp1.add(new Label("用户名："));  
        jp1.add(userField);  
        jp2.add(new Label("密码："));  
        jp2.add(passField);  
        jp3.add(jb1);  
        jp3.add(loginButton);  
        jf.add(jp3,BorderLayout.SOUTH);  
  
        jf.add(jp1,BorderLayout.NORTH);  
        jf.add(jp2 , BorderLayout.CENTER);  
        jf.pack();  
        jf.setVisible(true);  
    }  
    //注册用户和密码 （1）首先先检查数据库中是否有相应的数据，如果有的话提示"该用户存在，请直接登录。"  
    private void cheak(String userName, String userPass) throws Exception  
    {      
        if (validate(userField.getText(), passField.getText()))  
        {  
            JOptionPane.showMessageDialog(jf, "您已经有账号了请直接登录。");  
        }  
  
        else  
        {  
            String sql="insert ignore into student values(?,?)";  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?"  
                    + "user=root&password=768696&useUnicode=true&characterEncoding=UTF8");  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, userName);  
            pstmt.setString(2, userPass);  
            pstmt.executeUpdate();  
            JOptionPane.showMessageDialog(jf, "注册成功请登录。。。。");  
        }  
              
          
    }  
    //判断数据库中是否有该用户名和密码  
    private boolean validate(String userName, String userPass)  
    {  
        String sql="select *from student where student.name='"+userName+"' and student.password='"+userPass+"'";  
        try(  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?"  
                    + "user=root&password=zzl123&useUnicode=true&characterEncoding=UTF8");  
            Statement pstmt = conn.createStatement();  
                ResultSet rs=pstmt.executeQuery(sql))  
          
        {   //如果查询的ResultSet里有超过一条的记录，则登录成功  
                if (rs.next())  
                {  
                    return true;  
                }  
              
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
        return false;  
    }  
  
    public static void main(String[] args) throws Exception  
    {  
        new SJKLJ2().init();  
          
    }  
}  

