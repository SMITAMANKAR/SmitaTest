package TestNG;

import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups = {"sanity"})
  public void doRegister() {
	  System.out.println("First Test");
  }
  @Test(groups = {"Regression"})
  public void doSignout() {
	  System.out.println("Second Test");
  }
  @Test(groups = {"sanity", "Regression"})
  public void dologin() {
	  System.out.println("Third Test");
  }
  }

