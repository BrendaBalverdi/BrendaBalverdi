package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.MetodosUtiles.*;

public class TestWiki {



	WebDriver driver;
    @BeforeMethod
    public void precondicion () {
    	System.setProperty( "webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
    	Utiles.escribir("Inicializando Browser");
    	driver = new ChromeDriver();
    	Utiles.escribir("Ir a la página http://wikipedia.org");
    	driver.get("http://wikipedia.org");
   
    }
    
    @AfterMethod
    public void postcondicion () {
    Utiles.escribir ("Cerrar Browser");
    driver.close();
    
    }
    @DataProvider(name = "datos")
    public Object[][] createData() {
     return new Object[][] {
       { "Selenium","Selenium"},
       {  "TDD", "Desarrollo guiado por pruebas"},
       {"DATA DRIVEN TESTING","Data-driven testing"} 
    };
    }
    
	@Test(dataProvider = "datos",description = "Validar que las busquedas en Wikipedia funcionan")
	public void ValidarBusquedaWikipedia(String varBuscar,String resultado) throws Exception {
	Utiles.escribir("Buscar el elemento web caja de texto");
	WebElement searchInput = driver.findElement(By.id("searchInput"));
	Utiles.escribir("Verificar que esté desplegada la caja de búsqueda");
	Assert.assertTrue(searchInput.isDisplayed());
	Utiles.escribir("El contenido de la caja de texto es"+searchInput.getText().toString());
	Assert.assertTrue(searchInput.getText().toString().isEmpty(),"La caja de texto no está vacía");
	Utiles.escribir("Ingresar el texto Selenium");
	searchInput.sendKeys(varBuscar);
	Utiles.escribir("Presionar Enter");
	searchInput.submit();
	Utiles.escribir("Buscar el título");
	WebElement validarTitulo = driver.findElement(By.id("firstHeading"));
	Utiles.escribir("El contenido del titulo es"+validarTitulo.getText().toString());
	Assert.assertTrue (validarTitulo.getText().contains(resultado),"No contiene ese valor");
	Utiles.escribir("Verificar que el título sea desplegado");
	Assert.assertTrue(validarTitulo.isDisplayed());
	
	
}
	
	
	@Test(description = "Verificar que los elementos se muestren")
	public void VerificarElementosWikipedia() throws Exception {
	
	Utiles.escribir("Buscar los elementos de acceso a Wikipedia en otros idiomas");
	WebElement searchInput = driver.findElement(By.id("searchInput"));
	Utiles.escribir("Posicionarse en el titulo del idioma a elegir");
	Assert.assertTrue(searchInput.isDisplayed());
	Utiles.escribir("Hacer clic en el link Español");
	Thread.sleep(2000);
	WebElement linkEspaniol= driver.findElement(By.xpath("//strong[contains(text(),'Español')]"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkEspaniol.isDisplayed(),"No se muestra el link en Español");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Ruso");
	Thread.sleep(2000);
	WebElement linkRu = driver.findElement(By.xpath("//a[@id='js-link-box-ru']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkRu.isDisplayed(),"No se muestra el link en Ruso");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Alemán ");
	Thread.sleep(2000);
	WebElement linkDeutsch = driver.findElement(By.xpath("//a[@id='js-link-box-de']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkDeutsch.isDisplayed(),"No se muetra el link en Alemán");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Italiano ");
	Thread.sleep(2000);
	WebElement linkItaliano = driver.findElement(By.xpath("//a[@id='js-link-box-it']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkItaliano.isDisplayed(),"No se muetra el link en Italiano");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Persa");
	Thread.sleep(2000);
	WebElement linkFarsi = driver.findElement(By.xpath("//a[@id='js-link-box-fa']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkFarsi.isDisplayed(),"No se muestra el link en Persa");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Inglés");
	Thread.sleep(2000);
	WebElement linkEnglish = driver.findElement(By.xpath("//a[@id='js-link-box-en']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkEnglish.isDisplayed(),"No se muestra el link en Inglés");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Japones");
	Thread.sleep(2000);
	WebElement linkJapones = driver.findElement(By.xpath("//a[@id='js-link-box-ja']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkJapones.isDisplayed(),"No se muestra el link en Japones");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Frances");
	Thread.sleep(2000);
	WebElement linkFrances = driver.findElement(By.xpath("//a[@id='js-link-box-fr']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkFrances.isDisplayed(),"No se muestra el link en Frances");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Chino");
	Thread.sleep(2000);
	WebElement linkChino = driver.findElement(By.xpath("//a[@id='js-link-box-zh']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkChino.isDisplayed(),"No se muestra el link en Chino");
	Utiles.escribir("Volver a la página anterior");
	Utiles.escribir("Hacer clic en el link Portugues");
	Thread.sleep(2000);
	WebElement linkPortugues = driver.findElement(By.xpath("//a[@id='js-link-box-pt']/strong"));
	Utiles.escribir("Verificar que la página se muestre en el idioma elegido");
	Assert.assertTrue(linkPortugues.isDisplayed(),"No se muestra el link en Portugues");
	
}}