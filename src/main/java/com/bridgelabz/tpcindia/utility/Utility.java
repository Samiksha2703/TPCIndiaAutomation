
/**
 * purpose : To perform different functions
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */
package com.bridgelabz.tpcindia.utility;

import com.bridgelabz.tpcindia.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Utility extends Base {
    //Method to take a screenshot
    public static String screenshot(String fileName) throws IOException {
        File file = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\kalam\\IdeaProjects\\BookswagonAutomationProgram\\src\\main\\resources\\Screenshot/"+fileName+System.currentTimeMillis()+".jpg");
        String filePath = dest.getAbsolutePath();
        FileUtils.copyFile(file, dest);
        System.out.println("Screenshot Taken for "+fileName);
        return filePath;
    }
}
