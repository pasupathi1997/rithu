package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static WebDriver driver;

	public static void openchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	public static void urllaunch(String url) {
		driver.get(url);
		}
	public static void close() {
		driver.quit();
	}
	public static void waitprogram() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	public static String gettile() {
		String title = driver.getTitle();
		return title;
	}
	public static String takeurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	
	public static void driver(String xpathExpression) {
	WebElement element = driver.findElement(By.xpath(xpathExpression));	}

	public static void sendKeys(WebElement text, String input) {
		text.sendKeys(input);
		
		
	}

	public static void click(WebElement button) {
		button.click();
	}

	public static Actions a;

	public static void Action (WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();;
	}

	public static void moveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void keydown (CharSequence key) {
		a = new Actions(driver);
		a.keyDown(key).perform();
		
	}
	public static void keyup (CharSequence key) {
		a = new Actions(driver);
		a.keyUp(key).perform();
		
	}
	public static void doubleclick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void contextclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	public static void gettext(WebElement element) {
System.out.println(element.getText());
	}
	

	static Robot r;

	public static void Keypress(int keycode) throws AWTException {
		r = new Robot();
		r.keyPress(keycode);
				
	}

	public static void Buttonrelease(int keycode) {
		r.keyRelease(keycode);
	}

	static Alert b;

	public static void alertmessage() {
		b = driver.switchTo().alert();
	}

	public static void alertaccept() {
		b.accept();
	}

	public static void alertdismiss() {
		b.dismiss();
	}

	public static void alertSend(String keysToSend) {
		b.sendKeys(keysToSend);
	}

	public static void alertGetText() {
		b.getText();
	}
	public static TakesScreenshot t;
	public static void screenshot(String filepath) throws IOException {
		t=(TakesScreenshot) driver;
		File screen = t.getScreenshotAs(OutputType.FILE);
		File des=new File(filepath);
		
		FileUtils.copyFile(screen, des);
	}
	public static JavascriptExecutor js;
	public static void JavaScript() {
		js = (JavascriptExecutor) driver;
			}
	public static void javaclick(String args) {
		js.executeScript("arguments[0].click()", args);
		
	}
	public static void javasend(String args, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','args')", element);
	}
	public static void scrolldown(String args) {
		js.executeScript("arguments[0].scrollIntoView(true)", args);
	}
	public static void scrollup(String args) {
		js.executeScript("arguments[0].scrollIntoView(false)", args);

	}
	public static void frameswitchint (int index) {
driver.switchTo().frame(index);
	}
	public static void frameswitchstring (String name) {
		driver.switchTo().frame(name);
	}
	
	public static void frameswitchelementt (WebElement frameElement) {
	driver.switchTo().frame(frameElement);
	}
	public static  void Parentframe() {
	driver.switchTo().parentFrame();
	}
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
	public static void isdisplayed(WebElement arg) {
		boolean displayed = arg.isDisplayed();
	}
	public static void isenbeled(WebElement arg) {
		boolean enabled = arg.isEnabled();
	}
	public static void isselect(WebElement arg) {
		boolean selected = arg.isSelected();
	}
	public static void navigateback() {
driver.navigate().back();
	}
	public static void navigaeforward() {
		driver.navigate().forward();
	}
	public static void  navigaterefresh() {
		driver.navigate().refresh();
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void windowhandle() {
		String windowHandle = driver.getWindowHandle();

	}
	public static Set<String> windowHandles;
	public static void windowhandles() {
	Set<String> add = driver.getWindowHandles();
	List<String> s= new ArrayList<String>();
	s.addAll(add);
	driver.switchTo().window(s.get(1));
	}
	public static void currentdate() {
		Date d = new Date();
		System.out.println(d);

	}
	public static Select s;
	public static void selectindex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
}
	public static void selectvisible(WebElement element,String text) {
		s = new Select(element);
		s.selectByVisibleText(text);

	}
	public static void selectvalue(WebElement element,String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	
	//datadravin
	
	public static String excel (String sheetname, int rowno,int  cellno) throws IOException {
		
		File f = new File ("C:\\Users\\balaji\\eclipse-workspace\\Data\\ExcelSheet\\student.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sh = w.getSheet(sheetname);
		Row r = sh.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String data;
		if (type==1) {
			 data = c.getStringCellValue();
						
		} else if (DateUtil.isCellDateFormatted(c)){
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			 data = sim.format(da);

		}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			data = String.valueOf(l);
		}
		return data;
				
		
	}
	
public static void stay(int arg) {
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(arg, TimeUnit.SECONDS);
}

public static void screenshot() {
	TakesScreenshot s = (TakesScreenshot)driver;
	s.getScreenshotAs(OutputType.FILE);
	

}
}
