package Steps;

import Locators.LocatorsPageHome;
import Page.CartPage;
import Page.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;


public class ComprarProductoSteps extends hooks{
    HomePage hpage = new HomePage();
    CartPage cPage = new CartPage();

    @Given("el usuario navegara en la pagina Products Store")
    public void el_usuario_navegara_en_la_pagina_products_store() {

        //Assert.assertEquals(hpage.validarTituloHome(), "PRODUCT STORE");
        if(!hpage.validarTituloHome().equalsIgnoreCase("PRODUCT STORE")){
            Assert.fail("El titulo no coincide");
        }

    }
    @When("el usuario escogera el producto {string}")
    public void el_usuario_escogera_el_producto(String producto) {
        hpage.seleccionarProducto(producto);
    }

    @Then("el usuario lo agregara al carro de compras")
    public void el_usuario_lo_agregara_al_carro_de_compras() {
        hpage.AddToCar();
    }
    @Then("el usuario ira al carrito para realizar la compra")
    public void el_usuario_ira_al_carrito_para_realizar_la_compra() {
        cPage.ingresar();

        cPage.validarIngresoCart();
    }
    @When("el usuario de click en Place Order llenara el formulario con la siguiente informacion")
    public void el_usuario_de_click_en_place_order_llenara_el_formulario_con_la_siguiente_informacion_name_country_city_credit_card_month_year(DataTable dataTable) {
        cPage.completarCompra(dataTable);
        System.out.println("Detalles de la compra: " + cPage.validarCompra());

    }
}
