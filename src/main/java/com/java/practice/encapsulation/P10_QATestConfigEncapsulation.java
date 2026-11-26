package com.java.practice.encapsulation;

class TestConfiguration {
    private String browser;
    private String url;
    private int timeout;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        if (browser != null && (browser.equalsIgnoreCase("Chrome")
                || browser.equalsIgnoreCase("Firefox")
                || browser.equalsIgnoreCase("Edge"))) {
            this.browser = browser;
        } else {
            System.out.println("Unsupported browser: " + browser + ". Defaulting to Chrome.");
            this.browser = "Chrome";
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url != null && (url.startsWith("http://") || url.startsWith("https://"))) {
            this.url = url;
        } else {
            System.out.println("Invalid URL: Must start with http:// or https://");
        }
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        if (timeout > 0 && timeout <= 120) {
            this.timeout = timeout;
        } else {
            System.out.println("Invalid timeout (" + timeout + "s). Setting default 30s.");
            this.timeout = 30;
        }
    }
}
public class P10_QATestConfigEncapsulation {
	public static void main(String[] args) {
        TestConfiguration config = new TestConfiguration();
        config.setBrowser("Safari"); // Triggers fallback
        config.setUrl("https://example.com");
        config.setTimeout(45);

        System.out.println("Browser : " + config.getBrowser());
        System.out.println("URL     : " + config.getUrl());
        System.out.println("Timeout : " + config.getTimeout() + "s");
    }
}
