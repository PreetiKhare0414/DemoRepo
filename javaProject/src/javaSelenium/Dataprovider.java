package javaSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
 

  @DataProvider
  public Object[][] dp() {
   Object[][] data= new Object[2][2];
   
     data[0][0]="preeti@gmail.com";
     data[0][1]="preeti";
     
     data[1][0]="amit@gmail.com";
     data[1][1]="amit";
     
  return data;  
  }
}
