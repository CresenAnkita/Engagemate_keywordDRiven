package test_Enginee;


import java.awt.AWTException;
import org.testng.annotations.Test;
import TestRunner.Test_runner;

public class Test_Engine {
	
public Test_runner test;

	//@Test(priority = 1)
	public void Login_PositiveSceanrio() throws InterruptedException, AWTException {
		test= new Test_runner();
		test.StartExecution("Login_PositiveSceanrio");
		Thread.sleep(2000);
	}
	//@Test(priority = 2)
	public void Login_NegativeSceanrio() throws InterruptedException, AWTException {
		test= new Test_runner();
		test.StartExecution("Login_NegativeSceanrio");
		Thread.sleep(2000);
	}
	//@Test(priority = 3)
	public void CreateAct_CorpoMem_PositiveScenario() throws InterruptedException, AWTException {
		test= new Test_runner();
		test.StartExecution("CreateAct_CorpoMem_PositiveSce");
		Thread.sleep(2000);
	}

	//@Test(priority = 4)
	public void CreateAct_CorpoMem_NegativeScenario() throws InterruptedException, AWTException {
		test= new Test_runner();
		test.StartExecution("CreateAct_CorpoMem_NegativeSce");
		Thread.sleep(2000);
	}
	
	
	//@Test(priority = 5)
	public void CloseOut_CorpoMem_PositiveScenario() throws InterruptedException, AWTException {
		test= new Test_runner();
		test.StartExecution("CloseOut_CorpoMem_PositiveSce");
		Thread.sleep(2000);
	}
	
	//@Test(priority = 6)
		public void CloseOut_CorpoMem_NegativeScenario() throws InterruptedException, AWTException {
			test= new Test_runner();
			test.StartExecution("CloseOut_CorpoMem_NegativeSce");
			Thread.sleep(2000);
		}
	
		@Test(priority = 7)
		public void CreateAct_SpekerProgram_PositiveSce() throws InterruptedException, AWTException {
			test= new Test_runner();
			test.StartExecution("CreateAct_SpekerPro_PositiveSce");
			Thread.sleep(2000);
		}
	
	
	
	
	

}
