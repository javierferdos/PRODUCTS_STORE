package Page;

import Locators.LocatorsPageHome;
import base.Base;
import org.openqa.selenium.Alert;

import java.util.Locale;

public class HomePage extends Base {

    public String validarTituloHome(){
        return getText(LocatorsPageHome.titulo).trim().toUpperCase();
    }
    public void seleccionarProducto(String producto){

        try {
            click(LocatorsPageHome.xpathProducto.replace("NOMBRE_PRODUCTO",producto));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void AddToCar(){
        try {
            click(LocatorsPageHome.xpathAddToCar);
            Thread.sleep(1000);
            Alert alert = getDriver().switchTo().alert();
            alert.accept();
        }catch (Exception e){
            System.out.println("no se dio click");
        }
    }


}
