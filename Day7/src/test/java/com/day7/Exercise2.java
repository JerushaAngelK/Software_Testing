package com.day7;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Exercise2 {
	int a,b,c;
	@BeforeSuite
	void getdata() {
		System.out.println("Enter the values to calculate.");
//		Scanner sc=new Scanner(System.in);
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=sc.nextInt();
		a=5;
		b=10;
		
	}
  @Test
  public void Add() {
	  c=a+b;
	  Assert.assertEquals(c, 15);
  }
  @Test(priority=2)
  public void Sub() {
	  c=a-b;
	  Assert.assertEquals(c, -5);
  }
  @Test(priority=3)
  public void Mul() {
	  c=a*b;
	  Assert.assertEquals(c,50);
  }
  @Test(priority=4)
  public void Div() {
	  c=b/a;
	  Assert.assertEquals(c, 2);
  }
}
