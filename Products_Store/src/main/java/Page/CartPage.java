package Page;

import Locators.LocatorsPageCart;
import Locators.LocatorsPageHome;
import base.Base;
import com.ibm.icu.impl.Assert;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class CartPage extends Base {
    public void ingresar() {
        try {
            click(LocatorsPageCart.buttonCart);
            waitFor(getElement(LocatorsPageCart.tableProducts));
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validarIngresoCart() {
        getText(LocatorsPageCart.buttonCart).trim().toUpperCase();
    }

    public void completarCompra(DataTable dataTable) {
        Map<String, String>
                datos = dataTable.asMap(String.class, String.class);
        try {
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        click(LocatorsPageCart.placeOrderButton);
        waitFor(getElement(LocatorsPageCart.placeOrdenForm));

        click(LocatorsPageCart.inputNameForm);
        type(LocatorsPageCart.inputNameForm, datos.get("Name"));
        type(LocatorsPageCart.inputCountryForm, datos.get("Country"));
        type(LocatorsPageCart.inputCityForm, datos.get("City"));
        type(LocatorsPageCart.inputCrediCardForm, datos.get("Credit"));
        type(LocatorsPageCart.inputMonthForm, datos.get("Month"));
        type(LocatorsPageCart.inputYearForm, datos.get("Year"));
        try {
            Thread.sleep(2000);
            click(LocatorsPageCart.buttonPurchase);
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String validarCompra(){
        String resultados = "";
        if (getElement(LocatorsPageCart.divTextCOnfirmacion).isDisplayed()) {
            resultados = getText(LocatorsPageCart.textConfirmCompra);
            click(LocatorsPageCart.buttonOK);

        }
        return resultados;

    }

}
