package com.Jpet.steps;

import java.io.IOException;

import org.junit.Assert;

import com.Jpet.pages.Jpet_AddToCart_page;
import com.Jpet.pages.Jpet_CheckUserName_page;
import com.Jpet.pages.Jpet_PrintBill_page;
import com.Jpet.pages.Jpet_PrintMyOrderTable_page;
import com.Jpet.pages.Jpet_PrintProductTable_page;
import com.Jpet.pages.Jpet_Register_page;
import com.Jpet.pages.Jpet_RemoveFromCart_page;
import com.Jpet.pages.Jpet_SearchForLink_page;
import com.Jpet.pages.Jpet_SearchForProduct_page;
import com.Jpet.pages.Jpet_SignIn_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jpet_Application_steps {
	Jpet_Register_page register= new Jpet_Register_page();
	Jpet_AddToCart_page cart = new Jpet_AddToCart_page();
	Jpet_PrintProductTable_page product = new Jpet_PrintProductTable_page();
	 Jpet_SearchForProduct_page product1= new Jpet_SearchForProduct_page();
	 Jpet_SearchForLink_page link = new Jpet_SearchForLink_page();
	 Jpet_SignIn_page signin = new Jpet_SignIn_page();
	 Jpet_PrintBill_page bill = new Jpet_PrintBill_page();
	 Jpet_RemoveFromCart_page remove=new Jpet_RemoveFromCart_page();
	 Jpet_CheckUserName_page name = new Jpet_CheckUserName_page();
	 Jpet_PrintMyOrderTable_page myorder = new Jpet_PrintMyOrderTable_page();
	 
	@Given("^Launch application home page$")
	public void launchapplicationforregister() {
		
	}
	@Then("^To check for registeration$")
	public void register() throws InterruptedException, IOException  {
		register.register();
	}
		@And("^close browser$")
		public void close() {
			register.quit();
		}
		
		
		
	@Given("^select product category$")
	public void select_catogory() {
		cart.selectcategory();
	}
	@When("^select product$")
	public void select_product() {
		cart.selectproduct();
	}
	@Then("To check for add to cart")
	public void addtocart() throws IOException, InterruptedException {
		 
		cart.addtocart();
		cart.takescreenshot1("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\addtocart.png");
	}

	
	
	@Given("To select category")
	public void selectcategoryprint() {
		product.selectcategorytoprint();
	}
	@Then ("To check for print table")
	public void printproducttable() {	
		product.printproducttable();
	}
	
	
	
	
	
	@Given("to type a product")
	public void typeaproduct() {
		product1.type_a_product();
	}
	@Then("To check for search")
	public void search() throws IOException, InterruptedException {
		
		product1.search();
		product1.takescreenshot6("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\search.png");
	}
	
	
	
	
	@Then("To check for link")
	public void checkforlink() {
		int b =link.Checkforlink();
		if(b>0)
		{
			System.out.println("The link is present");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("The link is not present");
			Assert.assertFalse(false);
		}
	}
	
	
	
	
	
	@Given("click on signin button")
	public void click_on_signIn()
	{
		signin.clicksignin();
	}
	@Then("to check for signin")
	public void LaunchBrowser() throws IOException, InterruptedException {
		
		signin.signin();
	}
	@And("proceed to signin")
	public void click_signIn() {
		signin.clickonsignIn();
	}
	
	
	
	
	@Given("select a product for bill")
	public void selectproduct()
	{
bill.selectaproduct();
	}
	@Then("to check for printbill")
	public void applicationhomepage() {
		
		 bill.Printbill();
	}
	
	
	
	
	
@Given("add a product to cart")
public void add() {
	remove.add_to_cart();
}
	@Then("to check for remove from cart")
	public void signin() throws IOException, InterruptedException {
		remove.removefromCart();
		remove.takescreenshot2("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\removefromcart.png");
	}
	
	
	
	@Then("to check for compare name")
	public void comparename() throws InterruptedException {
		
		name.compare_name();
	}
	
	
	
	
	
	
	@Then("To print myorders table")
	public void print_myorder_table () {
		
		myorder.print_Myordertable();
	}
}