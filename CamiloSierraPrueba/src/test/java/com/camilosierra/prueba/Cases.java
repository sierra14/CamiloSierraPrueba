package com.camilosierra.prueba;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.camilosierra.util.Comunes;

public class Cases {

	WebDriver driver;
	Comunes comun = new Comunes();

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@Test
	public void firstTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-282\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=10; i++) {
		js.executeScript("window.scrollBy(0,300)", "");
		/**
		 * Escribe el nombre
		 */
		Thread.sleep(2000);
		WebElement nombreText = driver.findElement(By.name("nombre"));
		nombreText.sendKeys("Camilo");
		/**
		 * Escribe el Apellido
		 */
		Thread.sleep(2000);
		WebElement apellidoText = driver.findElement(By.name("apellidos"));
		apellidoText.sendKeys("Sierra");
		/**
		 * Escribe la empresa
		 */
		Thread.sleep(2000);
		WebElement empresaText = driver.findElement(By.name("empresa"));
		empresaText.sendKeys("Prueba");
		//
		// System.out.println(i);
		// }
		js.executeScript("window.scrollBy(0,300)", "");
		/**
		 * Escribe la ciudad
		 */
		Thread.sleep(2000);
		WebElement ciudadText = driver.findElement(By.name("ciudad"));
		ciudadText.sendKeys("Bogota");
		/**
		 * Escribe el telefono
		 */
		Thread.sleep(2000);
		WebElement telefonoText = driver.findElement(By.name("telefono"));
		telefonoText.sendKeys("1234567891");
		/**
		 * Escribe el correo
		 */
		Thread.sleep(2000);
		WebElement correoText = driver.findElement(By.name("correo"));
		correoText.sendKeys("prueba@prueba.es");

		js.executeScript("window.scrollBy(0,300)", "");

		/**
		 * Escribe el mensaje
		 */
		Thread.sleep(2000);
		WebElement msjText = driver
				.findElement(By.xpath("//*[@id=\"wpcf7-f1566-p273-o1\"]/form/center/p[2]/label[7]/span/textarea"));
		msjText.sendKeys("Esto es una prueba");
		/**
		 * Submit al formulario
		 */
		Thread.sleep(2000);
		WebElement botonEnviar = driver
				.findElement(By.xpath("//*[@id=\"wpcf7-f1566-p273-o1\"]/form/center/p[5]/input"));
		botonEnviar.click();

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 1);

		String mensaje;
		WebElement texto = driver.findElement(By.xpath("//*[@id=\"wpcf7-f1566-p273-o1\"]/form/center/span[2]/span"));
		mensaje = texto.getText();
		assertEquals("Por favor verifica el captcha", mensaje);

	}
	
	@Test
	public void secondTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		js.executeScript("window.scrollBy(0,2000)", "");
		// System.out.println(i);
		// }
		/**
		 * Click sobre profesional en formacion en lima
		 */
		Thread.sleep(10000);
		WebElement profesionalLima = driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li[4]/a"));
		profesionalLima.click();

		js.executeScript("window.scrollBy(0,500)", "");

		/**
		 * Click sobre inscribirse al trabajo
		 */
		WebElement botonInscribirse = driver.findElement(By.xpath("//*[@id=\"post-7768\"]/div/div[2]/div[3]/input"));
		botonInscribirse.click();
		
		/**
		 * Escribe el nombre
		 */
		WebElement cajaNombre = driver.findElement(By.name("your-name"));
		cajaNombre.sendKeys("Prueba2");
		
		/**
		 * Escribe el correo electronico
		 */
		WebElement cajaCorreo = driver.findElement(By.name("your-email"));
		cajaCorreo.sendKeys("prueba2@prueba2.co");
		
		/**
		 * Escribe el numero de celular
		 */
		WebElement cajaCelular = driver.findElement(By.name("tel"));
		cajaCelular.sendKeys("3214567890");
		
		/**
		 * Escribe estudios
		 */
		WebElement cajaEstudios = driver.findElement(By.name("estudios"));
		cajaEstudios.sendKeys("Prueba2 Estudios");
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		/**
		 * Escribe el tiempo de experiencia
		 */
		WebElement cajaExperiencia = driver.findElement(By.name("exp"));
		cajaExperiencia.sendKeys("2 años prueba");
		
		/**
		 * Escribe conoce automatización
		 */
		WebElement cajaConoce = driver.findElement(By.name("auto"));
		cajaConoce.sendKeys("Si conozco prueba");
		
		/**
		 * Escribe conoce automatización
		 */
		WebElement cajaSalario = driver.findElement(By.name("salario"));
		cajaSalario.sendKeys("3500000");
		
		js.executeScript("window.scrollBy(0,200)", "");
		
		/**
		 * Selecciona la disponibilidad
		 */
		WebElement selectDisponibilidad = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2347-p7768-o1\"]/form/p[8]/label/span/select"));
		selectDisponibilidad.click();
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f2347-p7768-o1\"]/form/p[8]/label/span/select/option[2]")).click();
		
		/**
		 * Escribe mensaje adicional
		 */
		WebElement cajaMensajeAd = driver.findElement(By.name("your-message"));
		cajaMensajeAd.sendKeys("Esto es una prueba para choucair");
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		WebElement botonEnviar = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2347-p7768-o1\"]/form/p[13]/input"));
		botonEnviar.click();
		
		Thread.sleep(1000);
		comun.capturaPantalla(driver, 2);
		
		String mensaje;
		WebElement texto = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2347-p7768-o1\"]/form/p[10]/label/span/span"));
		mensaje = texto.getText();
		assertEquals("El campo es obligatorio.", mensaje);

	}

	@Test
	public void thirdTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-6142\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		js.executeScript("window.scrollBy(0,500)", "");
		// System.out.println(i);
		// }

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 3);

		String mensaje;
		WebElement texto = driver.findElement(By
				.xpath("//*[@id=\"main\"]/div/div/div/div/section[5]/div/div/div/div/div/div[1]/div/h2"));
		mensaje = texto.getText();
		assertEquals("Capacidades de Pruebas de software Centradas en el negocio", mensaje);

	}
	
	@Test
	public void fourthTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-870\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		js.executeScript("window.scrollBy(0,4000)", "");
		// System.out.println(i);
		// }

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 4);

		String mensaje;
		WebElement texto = driver.findElement(By
				.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[19]/div/div/div[1]/div/div/div[1]/div/h2/b"));
		mensaje = texto.getText();
		assertEquals("Retos de transformación", mensaje);

	}
	
	@Test
	public void fifthTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-1876\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		js.executeScript("window.scrollBy(0,700)", "");
		// System.out.println(i);
		// }

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 5);

		String mensaje;
		WebElement texto = driver.findElement(By
				.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[4]/div/div/div/div/div/div[3]/div/h2"));
		mensaje = texto.getText();
		assertEquals("PROGRAMACIÓN DE CURSOS", mensaje);

	}
	
	@Test
	public void sixthTest() throws InterruptedException, IOException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-7979\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		//js.executeScript("window.scrollBy(0,700)", "");
		// System.out.println(i);
		// }

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 6);

		String mensaje;
		WebElement texto = driver.findElement(By
				.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[1]/div/div/div/div/div/div[1]/div/h2"));
		mensaje = texto.getText();
		assertEquals("NUESTRO BLOG", mensaje);

	}
	
	@Test
	public void seventhTest() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement servicios = driver.findElement(By.xpath("//*[@id=\"menu-item-7313\"]/a"));
		Thread.sleep(10000);
		servicios.click();
		Thread.sleep(8000);
		// for(int i=0; i<=8; i++) {
		js.executeScript("window.scrollBy(0,700)", "");
		// System.out.println(i);
		// }

		Thread.sleep(2000);
		comun.capturaPantalla(driver, 7);

		String mensaje;
		WebElement texto = driver.findElement(By
				.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[5]/div/div/div/div/div/div[1]/div/h2"));
		mensaje = texto.getText();
		assertEquals("Nuestra Misión", mensaje);

	}
	
	@After
	public void close() {
		driver.quit();
	}

}
