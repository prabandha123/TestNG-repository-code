package SeleniumTests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=2)
	public void signup() {
		System.out.println("Signup");
	}
	
	
	@Test(priority=-1)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=4)
	public void BookFlight() {
		System.out.println("BookFlight");
	}
	
	@Test(priority=3)
	public void SearchforFlight() {
		System.out.println("SearchforFlight");
	}
	
	@Test(priority=5)
	public void SaveTicket() {
		System.out.println("SaveTicket");
	}
	
	@Test(priority=5)
	public void BlueTest() {
		System.out.println("BlueTest");
	}

	@Test(priority=6)
	public void BlueTest() {
		System.out.println("Testing priority");
	}
	

}
