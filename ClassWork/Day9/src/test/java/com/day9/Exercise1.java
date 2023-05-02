package com.day9;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Exercise1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void Add(Integer a, Integer b) {
	  c=a+b;
	  System.out.println("Sum: "+c);
	  Assert.assertEquals(c, 15);
  }

  @Test(dataProvider="dp")
  public void Sub(Integer a,Integer b) {
	  c=a-b;
	  System.out.println("Subtraction: "+c);
	  Assert.assertEquals(c,5);
  }
  
  @Test(dataProvider="dp")
  public void Mul(Integer a,Integer b) {
	  c=a*b;
	  System.out.println("Multiplication: "+c);
	  Assert.assertEquals(c,50);
  }
  
  @Test(dataProvider="dp")
  public void Div(Integer a,Integer b) {
	  c=a/b;
	  System.out.println("Division: "+c);
	  Assert.assertEquals(c,2);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10,5 },
      new Object[] { 14,7 },
    };
  }
}
