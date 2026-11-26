package com.java.practice.interfaces;

interface BrowserActions {
    void openUrl(String url);
    void clickElement(String locator);
    void closeBrowser();
}

interface ScreenshotActions {
    void captureFullPage(String fileName);
    void captureElement(String locator, String fileName);
}

class WebDriverUtility implements BrowserActions, ScreenshotActions {
    @Override
    public void openUrl(String url) {
        System.out.println("[Browser] Navigating to: " + url);
    }

    @Override
    public void clickElement(String locator) {
        System.out.println("[Browser] Clicking element: " + locator);
    }

    @Override
    public void closeBrowser() {
        System.out.println("[Browser] Closing active browser session.");
    }

    @Override
    public void captureFullPage(String fileName) {
        System.out.println("[Screenshot] Saved full-page screenshot as: " + fileName);
    }

    @Override
    public void captureElement(String locator, String fileName) {
        System.out.println("[Screenshot] Saved element (" + locator + ") screenshot as: " + fileName);
    }
}

public class P10_AutomationInterfaceDesign {
	public static void main(String[] args) {
        WebDriverUtility driver = new WebDriverUtility();
        driver.openUrl("https://example.com");
        driver.clickElement("#submit-btn");
        driver.captureFullPage("login_result.png");
        driver.closeBrowser();
    }
}
