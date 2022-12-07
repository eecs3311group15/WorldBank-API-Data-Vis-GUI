package gui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UC1 {

	@Before
	public void setUp() throws Exception {
		
		String path = "user.csv";
		Helper.loadUserData(path);

	}

	@After
	public void tearDown() throws Exception {

	}
	
	@Test
	public void loginSuccessCheck1() {
		
		Listener_Login login = new Listener_Login();
		String user = "t4";
		String pass = "t4t4";
		
		int actual = login.correctLogin(user, pass);
		assertEquals(1, actual);
		
	}
	
	@Test
	public void loginSuccessCheck2() {
		
		Listener_Login login = new Listener_Login();
		String user = "t1@yorku.ca";
		String pass = "t1t1";
		
		int actual = login.correctLogin(user, pass);
		assertEquals(1, actual);
		
	}
	
	@Test
	public void loginFailCheck1() {
		
		Listener_Login login = new Listener_Login();
		String user = " ";
		String pass = "t1t1";
		
		int actual = login.correctLogin(user, pass);
		assertEquals(0, actual);
		
	}
	
	@Test
	public void loginFailCheck2() {
		
		Listener_Login login = new Listener_Login();
		String user = "t1@yorku.ca";
		String pass = " ";
		
		int actual = login.correctLogin(user, pass);
		assertEquals(0, actual);
		
	}
	
	@Test
	public void loginFailCheck3() {
		
		Listener_Login login = new Listener_Login();
		String user = "t3@yorku.ca";
		String pass = "t2t2";
		
		int actual = login.correctLogin(user, pass);
		assertEquals(0, actual);
		
	}

}