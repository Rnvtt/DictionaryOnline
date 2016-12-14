package mainui;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame{
	
	JLabel label1,label2;

    JTextField username ;//定义文本框组件
    JPasswordField password;//定义密码框组件
    JLabel jLabel1,jLabel2;
    JPanel jp1,jp2,jp3;
    JButton forget,login,signup; //创建按钮
    public LoginUI(){
        username = new JTextField(16);
        password = new JPasswordField(16);
        jLabel1 = new JLabel("用户名");
        jLabel2 = new JLabel("密    码");
        forget = new JButton("忘记密码");
        login = new JButton("登陆");
        signup = new JButton("注册");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        //设置布局
        this.setLayout(new GridLayout(3,1));

        jp1.add(jLabel1);
        jp1.add(username);//第一块面板添加用户名和文本框

        jp2.add(jLabel2);
        jp2.add(password);//第二块面板添加密码和密码输入框

        jp3.add(forget);
        jp3.add(login);
        jp3.add(signup); //第三块面板添加确认和取消

        //        jp3.setLayout(new FlowLayout());  　　//因为JPanel默认布局方式为FlowLayout，所以可以注销这段代码.
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);  //将三块面板添加到登陆框上面
        //设置显示
        this.setSize(300, 200);
        //this.pack();
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("登陆");
    }
}