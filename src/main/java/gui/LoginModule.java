package gui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginModule extends JFrame{
	
	private static LoginModule instance;
	
	private static JLabel userName;
	private static JLabel pass;
	private static JButton button;
	protected static JTextField userT;
	protected static JPasswordField passT;
	protected static JFrame f;
	private static JPanel panel;
	protected static ArrayList<String> emails = new ArrayList<String>();
	protected static ArrayList<String> passwords = new ArrayList<String>();
	private static String path = "user.csv";
	
	public static LoginModule getInstance() throws Exception {
		if (instance == null)
			instance = new LoginModule();

		return instance;
	}
	
	private LoginModule() throws Exception {
		super("Login");

    	panel = new JPanel();
    	userT = new JTextField(10);
    	passT = new JPasswordField(10);
    	userName = new JLabel("Username:");
    	pass = new JLabel("Password:");
    	button = new JButton("Login");
    	
    	Helper.loadUserData(path);
   
    	panel.setLayout(null);
    	
    	userName.setBounds(20, 15, 80, 20);
    	panel.add(userName);
    	
    	pass.setBounds(20, 45, 80, 20);
    	panel.add(pass);
    	
    	userT.setBounds(85, 17, 160, 20);
    	panel.add(userT);
    	
    	passT.setBounds(85, 47, 160, 20);
    	panel.add(passT);
    	
    	button.setBounds(100, 80, 80, 20);
    	button.addActionListener(new LoginListener());
    	panel.add(button);
	}

	
	public static void startLoginModule() throws Exception {

		f = LoginModule.getInstance();
		f.setSize(320, 145);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setVisible(true);
    	f.add(panel);
	}

}
