package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class LoginListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String user = LoginModule.userT.getText();
		String password = LoginModule.passT.getText();
		int success = 0;
		
		for(int i = 0; i < LoginModule.emails.size(); i++) {			
			
			if (user.equals(LoginModule.emails.get(i)) && password.equals(LoginModule.passwords.get(i))) {			
				success = 1;				
			}	
		}
	
		if (success == 1) {
		
			System.out.println(user + "  " + password);
			System.out.println("Login Success");
			LoginModule.f.setVisible(false);
			success = 0;
			try {
				MainUI.startMainUI();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}		
		else {		
			System.out.println(user + "  " + password);
			System.out.println("Login Failed");		
		}
		
	}

}
