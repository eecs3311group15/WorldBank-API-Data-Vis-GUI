package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class Listener_Login implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		String user = LoginModule.userT.getText();
		String password = LoginModule.passT.getText();
			
		int success = 0;
		
		success = correctLogin(user, password);
	
		if (success == 1) {
		
			System.out.println("Login Success");
			LoginModule.f.setVisible(false);
			success = 0;
			Helper.popupMsg("README:\n"
					+ "Please select a type of Analysis first (Once a Viewer has been added, you can no longer "
					+ "modify the selected Analysis. \nReason: "
					+ "Due to UC5/UC6, some analyses are not compatible with some type of Viewers)\n"
					+ "Please use RESET button if you want to change Analysis.\n"
					+ "How we handle partially missing data: \n"
					+ "If data in any year of the selected time frame is partially missing, "
					+ "the entire year's data is removed from the graph"
			);
			try {
				MainUI.startMainUI();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}		
		else {		
			
			System.out.println("Login Failed");	
			Helper.popupMsg("Wrong UserID or Password (Tester account: ID: t4  PW: t4t4 )");
			
		}
		
	}
	
	public int correctLogin(String user, String pass) {
		
	for (int i = 0; i < LoginModule.emails.size(); i++) {			
			
			if (user.equals(LoginModule.emails.get(i)) && pass.equals(LoginModule.passwords.get(i))) {	
				
				return 1;			
				
			}	
		}
		
	return 0;
	
	}

}
