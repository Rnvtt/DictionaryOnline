package mainui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import config.LoginButtonConfig;
import po.WordInfo;
import util.DataFactory;
import util.UIFactory;

public class LoginButton extends JButton implements ActionListener{
	private static final long serialVersionUID = -6847227296705939178L;

	public LoginButton() {
		setContentAreaFilled(false);
		setFocusPainted(false);
		setBounds(LoginButtonConfig.LOC_X,LoginButtonConfig.LOC_Y,LoginButtonConfig.WIDTH,LoginButtonConfig.HEIGHT);
		setText("Login");
		setToolTipText("login");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		UIFactory.getLoginFrameInstance();
	}
}
