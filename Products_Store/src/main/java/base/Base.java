package base;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Base extends PageObject {

    WebElementFacade element = null;
    List<WebElementFacade> elements = null;

    /******** FUNCIONALIDADES COMUNES ********/

    /***
     * Encontrar elemento con una expresion de busqueda en formato string retornando
     * un WebElementFacade
     ***/
    public WebElementFacade getElement(String locator) {
        return getElement(getBy(locator));

    }

    /***
     * Encontrar elemento con una expresion de busqueda en formato locator
     * retornando un WebElementFacade
     ***/
    public WebElementFacade getElement(By locator) {
        try {
            element = find(locator);
        } catch (Exception e) {
            e.getMessage();
        }
        return element;
    }

    /***
     * Ayuda a identificar un elemento para el metodo getElement(String) que recibe
     * como parametro un string
     ***/
    private By getBy(String locator) {
        By by = null;

        try {
            if (locator.startsWith("id")) {
                locator = locator.substring(3);
                by = By.id(locator);
            } else if (locator.startsWith("xpath")) {
                locator = locator.substring(6);
                by = By.xpath(locator);
            } else if (locator.startsWith("css")) {
                locator = locator.substring(4);
                by = By.cssSelector(locator);
            } else if (locator.startsWith("name")) {
                locator = locator.substring(5);
                by = By.name(locator);
            } else if (locator.startsWith("link")) {
                locator = locator.substring(5);
                by = By.linkText(locator);
            }

        } catch (Throwable t) {
            t.getMessage();
        }
        return by;
    }

    /***
     * Encontrar multiples elementos con una expresion de busqueda en formato string
     * retornando un WebElementFacade
     ***/
    public List<WebElementFacade> getElements(String locator) {
        return getElements(getBy(locator));

    }

    /***
     * Encontrar multiples elementos con una expresion de busqueda en formato string
     * retornando un WebElementFacade
     ***/
    public List<WebElementFacade> getElements(By locator) {
        try {
            elements = findAll(locator);
        } catch (Exception e) {
            e.getMessage();
        }
        return elements;

    }


    /***
     * Clickea el elemento por medio del parametro locator String
     *
     * @param locator
     */
    public void click(String locator) {
        click(getElement(locator));
    }

    /***
     * Clickea el elemento por medio del parametro locator By
     *
     * @param locator
     */
    public void click(By locator) {
        click(getElement(locator));
    }

    public void click(WebElement element) {
        waitFor(element).click();
    }

    /**
     * Ingresa el texto en el elemento
     *
     * @param locator
     * @param value
     */
    public void type(String locator, String value) {
        type(getElement(locator), value);
    }

    /**
     * Ingresa el texto en el elemento
     *
     * @param locator
     * @param value
     */
    public void type(By locator, String value) {
        type(getElement(locator), value);
    }

    public void type(WebElement element, String value) {
        waitFor(element).sendKeys(value);
    }

    /**
     * Retorna el texto por medio de un locator String
     *
     * @param locator
     * @return
     */
    public String getText(String locator) {
        return getText(getElement(locator));
    }

    /**
     * Retorna el texto por medio de un locator By
     *
     * @param locator
     * @return
     */
    public String getText(By locator) {
        return getText(getElement(locator));
    }

    public String getText(WebElement element) {
        return waitFor(element).getText();
    }

    /**
     * Colocar el mouse sobre un elemento por medio de un locator String
     *
     * @param locator
     */
    public void moveMouseTo(String locator) {
        moveMouseTo(getElement(locator));
    }

    /**
     * Colocar el mouse sobre un elemento por medio de un locator By
     *
     * @param locator
     */
    public void moveMouseTo(By locator) {
        moveMouseTo(getElement(locator));
    }

    public void moveMouseTo(WebElement element) {
        WebElement moveTo = waitFor(element);
        withAction().moveToElement(moveTo).perform();
    }
}

