/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice101;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Neo
 */
public class readConfig {
    File file = new File("C:\\Users\\Sanket\\Documents\\NetBeansProjects\\Practice101\\src\\Configurations\\config.properties");
    Properties prop = new Properties();
    public void readconfig(){
        OpenBrowser obj = new OpenBrowser();
        try {
            //create an input stream for required file
            FileInputStream fis = new FileInputStream(file);
            //load the property file
            prop.load(fis);
            // get a BrowserType form Property file
            String browser = prop.getProperty("BrowserType");
//            System.out.println(browser);
            // get a url form Property file
            String url = prop.getProperty("url");
//            System.out.println(url);
            // get a DriverPath form Property file
            String driverPath = prop.getProperty("DriverPath");
//            System.out.println(driverPath);
            // Open the browser
            obj.openBrowser(browser, url, driverPath);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
