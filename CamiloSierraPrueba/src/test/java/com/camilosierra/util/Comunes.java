package com.camilosierra.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Comunes {

	public void capturaPantalla(WebDriver driver, int test) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\EvidenciaPrueba\\Test"+test+".jpg");
		FileUtils.copyFile(srcFile, destFile);
	}

}
