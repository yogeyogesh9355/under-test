Feature: Jpet 

@jpet_test_case_Register
Scenario: 
To test the application for register

Given Launch application home page
Then To check for registeration


@jpet_test_case_AddToCart
Scenario:
To test the application for add to cart
Given select product category
When select product
Then To check for add to cart

@jpet_test_case_PrintProductTable
Scenario:
To test the application for print product table
Given To select category
Then To check for print table

@jpet_test_case_SearchForProduct
Scenario:
To test the application for SearchProduct
Given to type a product
Then To check for search

@jpet_test_case_SearchForLink
Scenario:
To test the application for SearchLink
Then To check for link

@jpet_test_case_SignIn
Scenario: 
To test the application for SignIn
Given click on signin button
Then to check for signin
And proceed to signin

@jpet_test_case_PrintBill
Scenario: 
To test the application for PrintBill
Given select a product for bill
Then to check for printbill

@jpet_test_case_RemoveProductFromCart
Scenario: 
To test the application for AddProductToCart
Given add a product to cart
Then to check for remove from cart

@jpet_test_case_CompareUserName
Scenario: 
To test the application for CheckUserName
Then to check for compare name

@jpet_test_case_PrintMyOrderTable
Scenario: 
To test the application for PrintMyOrderTable
Then To print myorders table
And close browser