package mainui;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame{
	
	JLabel label1,label2;

    JTextField username ;//�����ı������
    JPasswordField password;//������������
    JLabel jLabel1,jLabel2;
    JPanel jp1,jp2,jp3;
    JButton forget,login,signup; //������ť
    public LoginUI(){
        username = new JTextField(16);
        password = new JPasswordField(16);
        jLabel1 = new JLabel("�û���");
        jLabel2 = new JLabel("��    ��");
        forget = new JButton("��������");
        login = new JButton("��½");
        signup = new JButton("ע��");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        //���ò���
        this.setLayout(new GridLayout(3,1));

        jp1.add(jLabel1);
        jp1.add(username);//��һ���������û������ı���

        jp2.add(jLabel2);
        jp2.add(password);//�ڶ�����������������������

        jp3.add(forget);
        jp3.add(login);
        jp3.add(signup); //������������ȷ�Ϻ�ȡ��

        //        jp3.setLayout(new FlowLayout());  ����//��ΪJPanelĬ�ϲ��ַ�ʽΪFlowLayout�����Կ���ע����δ���.
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);  //�����������ӵ���½������
        //������ʾ
        this.setSize(300, 200);
        //this.pack();
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("��½");
    }
}