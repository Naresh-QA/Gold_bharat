package Test_cases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pom_files.Homepage;
import pom_files.Registeration_pom;

public class Reisteration_testcases extends Base_testcases {
@Test
void register() throws InterruptedException {
	Homepage hp=new Homepage(driver);
	hp.register();
	Registeration_pom reg=new Registeration_pom(driver);
	reg.setbusinessname(randomString());
	reg.setfullname(randomString());
	reg.setmailid(randomString()+"@gmail.com");
	reg.setphonenumber(randomnumber());
	reg.setdate("12121996");
	reg.setpincode("508206");
	Thread.sleep(2000);
	reg.setcircle();
	reg.setaddress(randomString());
	reg.setregister();
	
	
}


}
