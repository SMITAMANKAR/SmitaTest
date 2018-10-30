package ParallelTest;

import org.testng.annotations.Test;

public class TestA {
  @Test
  public void TestAMethod() throws InterruptedException {
	  System.out.println("Start Test A");
	  Thread.sleep(2000);
	  System.out.println("End Test A");
	  
  }
}
