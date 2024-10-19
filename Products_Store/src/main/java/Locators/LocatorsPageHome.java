package Locators;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LocatorsPageHome extends PageObject {
    public static final By titulo = By.xpath("//a[normalize-space(text())='PRODUCT STORE']");
    public static String xpathProducto = "xpath=//a[normalize-space(text())='NOMBRE_PRODUCTO']";
    public static By xpathAddToCar = By.xpath("//a[normalize-space(text())='Add to cart']");




}
