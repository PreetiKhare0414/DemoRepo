package javaTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG1 {
	
	@Test(priority =2,invocationCount=2)
	public void a2() {
		System.out.println("a2 Test Method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("@Before Test Method");
	}
	
	@BeforeMethod
	public void c() {
		System.out.println("@Before Method");
	}
	
	@BeforeSuite
	public void d() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void e() {
		System.out.println("@AfterSuite");
	}
	
	@AfterMethod
	public void f() {
		System.out.println("@AfterMethod");
	}
	@Test(priority=-20,enabled=false)
	public void a1() {
		System.out.println("a1 Test Method");
	}
	
	@BeforeClass
	public void b1() {
		System.out.println("@BeforeClass Method");
	}
	
	@AfterClass
	public void c1() {
		System.out.println("@AfterClass Method");
	}
} 
