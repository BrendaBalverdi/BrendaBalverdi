package com.selenium.MetodosUtiles;
import org.testng.Reporter;
public class Utiles {


	public static void  escribir (String linea) {
		System.out.println(linea);
		Reporter.log(linea);

}
}