package ParallelTest;

import org.testng.annotations.Test;

public class TestB {
  @Test
  public void TestBMethod() throws InterruptedException {
	  System.out.println("Start Test B");
	  Thread.sleep(2000);
	  System.out.println("End Test B");
}
}
