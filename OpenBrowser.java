/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author Neo
 */
public class OpenBrowser {
     public void openBrowser(String Browser, String URL, String Driverpath){
         WebDriver driver = null;
         actionPerformed obj = new actionPerformed();
         switch(Browser){
             case "IE": 
                //Set the properties to open the chrome browser
                System.setProperty("webdriver.ie.driver", Driverpath);
                //Initialize IE driver
                driver = new InternetExplorerDriver();
                //Get the url in Browser
                driver.get(URL);
                //Maximize the Window
                driver.manage().window().maximize();
             case "Chrome":
                System.setProperty("webdriver.chrome.driver", Driverpath);
                //Initialize chrome driver
                driver = new ChromeDriver();
                //Get the url in Browser
                driver.get(URL);
                //Maximize the Window
                driver.manage().window().maximize();
         }
         obj.login(driver);
        //print the message just for fun
        driver.quit();
    }
}