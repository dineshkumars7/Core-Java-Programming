package com.java.practice.oops_concepts;


//Base Test Class
class BaseTest {
 protected String browser;

 public void setUp(String browser) {
     this.browser = browser;
     System.out.println("[Setup] Launching " + browser + " browser...");
 }

 public void tearDown() {
     System.out.println("[Teardown] Closing " + browser + " browser.");
 }
}

//Page Object: Login Page
class LoginPage {
 private String expectedUser = "qa_lead";
 private String expectedPass = "Admin@123";

 public DashboardPage login(String username, String password) {
     System.out.println("[LoginPage] Entering username: " + username);
     System.out.println("[LoginPage] Entering password: ********");
     if (expectedUser.equals(username) && expectedPass.equals(password)) {
         System.out.println("[LoginPage] Login successful.");
         return new DashboardPage(username);
     }
     throw new RuntimeException("Invalid credentials!");
 }
}

//Page Object: Dashboard Page
class DashboardPage {
 private String loggedInUser;

 public DashboardPage(String loggedInUser) {
     this.loggedInUser = loggedInUser;
 }

 public void verifyWelcomeBanner() {
     System.out.println("[DashboardPage] Verified banner: 'Welcome, " + loggedInUser + "'");
 }
}

public class P10_LoginTestRunner extends BaseTest {
	public void executeLoginTest() {
        setUp("Chrome");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboard = loginPage.login("qa_lead", "Admin@123");
        dashboard.verifyWelcomeBanner();
        tearDown();
    }
}
