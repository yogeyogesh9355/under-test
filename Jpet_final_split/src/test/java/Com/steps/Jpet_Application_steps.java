package Com.steps;

import java.io.IOException;

import Com.pages.Jpet_AddToCart_page;
import Com.pages.Jpet_CheckUserName_page;
import Com.pages.Jpet_PrintBill_page;
import Com.pages.Jpet_PrintMyOrderTable_page;
import Com.pages.Jpet_PrintProductTable_page;
import Com.pages.Jpet_Register_page;
import Com.pages.Jpet_RemoveFromCart_page;
import Com.pages.Jpet_SearchForLink_page;
import Com.pages.Jpet_SearchForProduct_page;
import Com.pages.Jpet_SignIn_page;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Jpet_Application_steps {
	
	@Given("^To check for registeration$")
	public void to_check_for_registeration() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_Register_page register = new Jpet_Register_page();
		register.register();
		
	   
	}

	@When("^To check for add to cart$")
	public void to_check_for_add_to_cart() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Jpet_AddToCart_page cart = new Jpet_AddToCart_page();
			cart.addtocart();
			cart.takescreenshot1("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\addtocart.png");
		
	    
	}

	@Then("^To check for print table$")
	public void to_check_for_print_table() {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_PrintProductTable_page product = new Jpet_PrintProductTable_page(); 
		product.printproducttable();
	   
	}

	@Then("^To check for search$")
	public void to_check_for_search() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_SearchForProduct_page product= new Jpet_SearchForProduct_page();
		product.search();
		product.takescreenshot6("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\search.png");
	}

	@Then("^To check for link$")
	public void to_check_for_link() {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_SearchForLink_page link = new Jpet_SearchForLink_page();
		link.Checkforlink();
	}

	@Then("^to check for signin$")
	public void to_check_for_signin() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_SignIn_page signin = new Jpet_SignIn_page();
		signin.signin();
	}

	@Then("^to check for printbill$")
	public void to_check_for_printbill() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_PrintBill_page bill = new Jpet_PrintBill_page();
		 bill.Printbill();
	   
	}

	@Then("^to check for remove from cart$")
	public void to_check_for_remove_from_cart() throws IOException, InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Jpet_RemoveFromCart_page remove=new Jpet_RemoveFromCart_page();
		remove.removefromCart();
		remove.takescreenshot2("C:\\Users\\Lenovo\\Desktop\\Jpet confirm\\Z_Jpet2\\src\\test\\resources\\screenshot\\removefromcart.png");
	 
	}

	@Then("^to check for compare name$")
	public void to_check_for_compare_name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_CheckUserName_page name = new Jpet_CheckUserName_page();
		name.compare_name();
	  
	}

	@Then("^To print myorders table$")
	public void to_print_myorders_table() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Jpet_PrintMyOrderTable_page myorder = new Jpet_PrintMyOrderTable_page();
		myorder.print_Myordertable();
	   
	}
}