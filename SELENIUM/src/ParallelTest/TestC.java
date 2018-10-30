package ParallelTest;

import org.testng.annotations.Test;

public class TestC {
  @Test
  public void TestAMethod() throws InterruptedException {
	  System.out.println("Start Test C");
	  Thread.sleep(2000);
	  System.out.println("End Test C");
}
}