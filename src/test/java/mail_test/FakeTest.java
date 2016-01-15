package mail_test;

import org.testng.annotations.Test;

public class FakeTest {
	@Test
	private void myTestOne() {
		throw new RuntimeException();
//		System.out.println("Hello world test!");
	}
	
	@Test
	private void myTestSecond() {
//		throw new RuntimeException();
		System.out.println("Hello world test!");
	}
}
