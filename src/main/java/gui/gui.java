package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

class gui implements ActionListener{
	
	private static JLabel userName;
	private static JLabel pass;
	private static JButton button;
	private static JTextField userT;
	private static JPasswordField passT;
	private static JFrame f;
	private static ArrayList<String> emails = new ArrayList<String>();
	private static ArrayList<String> passwords = new ArrayList<String>();
	private static String path = "user.csv";
	
	
    public static void load(String path) throws Exception{
    	
        CsvReader reader = new CsvReader(path); 
        reader.readHeaders();

        while(reader.readRecord()){
        	
            emails.add(reader.get("email"));
            passwords.add(reader.get("password"));
        }
       
    }
	
    public static void main(String args[]) throws Exception{
    	 
    	f = new JFrame("Login");//creating instance of JFrame  
    	JPanel panel = new JPanel();
    	userT = new JTextField(10);
    	passT = new JPasswordField(10);
    	userName = new JLabel("Username:");
    	pass = new JLabel("Password:");
    	button = new JButton("Login");
    	
    	load(path);
	   
    	f.setSize(320, 145);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setVisible(true);
    	f.add(panel);
   
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
    	button.addActionListener(new gui());
    	panel.add(button);
        
    }

	public void actionPerformed(ActionEvent e) {
		
		String user = userT.getText();
		String password = passT.getText();
		int success = 0;
		
		for(int i = 0; i < emails.size(); i++) {
			
			
			if (user.equals(emails.get(i)) && password.equals(passwords.get(i))) {
			
				success = 1;
				
			}	
		}
	
		if (success == 1) {
		
			System.out.println(user + "  " + password);
			System.out.println("Success");
			f.setVisible(false);
			success = 0;
		
		}
		
		else {
			
			System.out.println(user + "  " + password);
			System.out.println("Failed");
			
		}
	}
}