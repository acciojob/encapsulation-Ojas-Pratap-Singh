package com.driver;

public class Main {
  public static void main(String[] args){

      RWOnly rwOnly = new RWOnly();
      //rwOnly.name = "ojas";
      //'name' has private access in 'com.driver.RWOnly'
      rwOnly.setName("ojas");
      System.out.println(rwOnly.getName());
  }
}