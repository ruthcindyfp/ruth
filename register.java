/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruthjait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ITD-STU
 */
public class register {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.bukalapak.com/register?comeback=https%3A%2F%2Fwww.bukalapak.com%2F&from=nav_header/");
}
}
