package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComprarProductoSteps {
    @Given("el usuario navegara en la pagina Products Store")
    public void el_usuario_navegara_en_la_pagina_products_store() {
        System.out.println("el usuario navegara en la pagina Products Store");
    }
    @When("el usuario escogera el producto {string}")
    public void el_usuario_escogera_el_producto(String producto) {
        System.out.println("el usuario escogera el producto");
    }
    @Then("el usuario lo agregara al carro de compras")
    public void el_usuario_lo_agregara_al_carro_de_compras() {
        System.out.println("el usuario lo agregara al carro de compras");
    }
    @Then("el usuario ira al carrito para realizar la compra")
    public void el_usuario_ira_al_carrito_para_realizar_la_compra() {
        System.out.println("el usuario ira alcancelar la compra");
    }
    @When("el usuario de click en Place Order llenara el formulario con la siguiente informacion")
    public void el_usuario_de_click_en_place_order_llenara_el_formulario_con_la_siguiente_informacion_name_country_city_credit_card_month_year(DataTable dataTable) {
        System.out.println("el usuario de click en Place Order llenara el formulario con la siguiente informacion");

    }
}
