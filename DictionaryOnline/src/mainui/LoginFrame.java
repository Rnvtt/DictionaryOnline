package mainui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import config.LoginFrameConfig;
import util.UIFactory;
/**
 * A Controller
 */
public class LoginFrame extends JFrame{

	private static final long serialVersionUID = 8328872782891372697L;
	
	public LoginFrame() {
		init();
	}
	
	private void init() {
		this.setTitle("sign up/login in");
		int width = LoginFrameConfig.WIDTH;
		int height = LoginFrameConfig.HEIGHT;
		
		this.setSize(width,height);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dimension.width - width)>>1,((dimension.height - height)>>1) - 15);
		
		
		initComponent();
		
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initComponent() {
		Container container = getContentPane();

		//container.add(UIFactory.getWordInputFieldInstance());
		container.add(UIFactory.getLoginUIInstance());
/*		container.add(UIFactory.getWordContentInstance());
		container.add(UIFactory.getWordContent_Youdao());
		container.add(UIFactory.getWordContent_ICIBA());
		container.add(UIFactory.getWordInputFieldInstance());
		container.add(UIFactory.getLoginButtonInstance());*/
	}

	
}
