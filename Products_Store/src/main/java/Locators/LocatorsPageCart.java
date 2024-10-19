package Locators;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class LocatorsPageCart extends PageObject {
    public static final By buttonCart = By.xpath("//a[normalize-space(text())='Cart']");
    public static final By tableProducts = By.xpath("//h2[text()='Products']/following-sibling::div");
    public static final By placeOrderButton = By.xpath("//button[@class='btn btn-success']");
    public static final By placeOrdenForm = By.xpath("//h5[normalize-space(text())='Place order']");
    public static final By inputNameForm = By.xpath("(//label[normalize-space(text())='Name:']/following::input)[1]");
    public static final By inputCountryForm = By.xpath("(//label[normalize-space(text())='Country:']/following::input)[1]");
    public static final By inputCityForm = By.xpath("(//label[normalize-space(text())='City:']/following::input)[1]");
    public static final By inputCrediCardForm = By.xpath("(//label[normalize-space(text())='Credit card:']/following::input)[1]");
    public static final By inputMonthForm = By.xpath("(//label[normalize-space(text())='Month:']/following::input)[1]");
    public static final By inputYearForm = By.xpath("(//label[normalize-space(text())='Year:']/following::input)[1]");
    public static final By buttonPurchase = By.xpath("//button[normalize-space(text())='Purchase']");
    public static final By textConfirmCompra = By.xpath("//div[contains(@class,'sweet-alert ')]//p[1]");
    public static final By buttonOK = By.xpath("//button[contains(@class,'confirm btn')]");
    public static final By divTextCOnfirmacion = By.xpath("//div[@data-allow-outside-click='false']");






}
