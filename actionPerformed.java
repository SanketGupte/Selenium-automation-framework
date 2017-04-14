/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Neo
 */
public class actionPerformed {
    public void login(WebDriver driver){
        driver.findElement(By.id("login-email")).sendKeys("sanket.gupte542@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("primus123");
//      //Click on SignIn
        driver.findElement(By.id("login-submit")).click();
    }
    
}
