package com.sr.Testscripts;

import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.pompages.Addtocart;
import com.sr.pompages.Login;

public class Addingtocart extends BaseClass{
  @Test
  public void tc1()
  {
	  Login l = new Login(driver);
	  u.mouseAction(driver, l.getCoursetab());
	  l.seleniumtrainigbtn();
	  
	  Addtocart a=new Addtocart(driver);
	  u.doubleClick(driver, a.getAddbtn());
	 a.addtocartbutton();
		 u.alertpopup(driver);
		 a.productcart();
		 a.gotocartbtn();
	  }
}
