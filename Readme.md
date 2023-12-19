<h1 align="center"> Task for Extrawest </h1>

## 💬Summary:
The most important test for the Stylus website is **to buy a product**.
<br>Why this test? For a website like Stylus, **the most important task is to sell**.
<br>In this project, the implementation of the product purchase test.


## 📚Test-case:

I've applied the TestRail platform to create a test case.
<br>[Click here to see test-case](https://drive.google.com/file/d/1D9ckkmAYkH7jf7xbMTadAyEhBEpQi70T/view)

## 📚Test plan and test strategy:

[Click here to see test plan](https://drive.google.com/file/d/136Z4VaW9KmiEJP04OtbFUeM_-9wAUCXr/view)
<br>[Click here to see test strategy](https://drive.google.com/file/d/14M6EQNSPbITnGZjFQcYwwMapdN2osdOK/view)


## 📢I've applied:

- Selenide, Maven, TestNG, assertJ, Lombok.
- Pattern - Page Object (breaking down into **_pages_** and **_locators_**).
- Assertions using **_assertJ_** library.
- Properties to identify user data.
- Random Generator to generate payment types and street names.
- I've created an optimal test coverage that covers the maximum number of test cases.

## 💡Creating process:

- 1.In BaseTest create BeforeMethod "setUp", where we customize the environment (browser), make it full screen and specify the URL.
- 2.Create Pages class in package "pages", where create methods for test.
- 3.Create Locators class in package "locators" for every page.
- 4.In package "enum", there are classes, where create constants to verify the expected result of payment types and delivery streets to generate values.
- 5.Create "FakeRandomGenerator" to generate random values from payment list (class "PaymentType") and delivery streets (class "DeliveryStreet").
- 6.In package "utils", in class "Constants" create user data constants.
- 7.In package "utils", in class "UtilsMethod" create method that reads values from the configuration file. 
- 8.Create configuration file "config.properties" in package "resources".
- 9.Make pop-up separated in package "components".
- 10.In class "Helper" there is method, which select value from dropdown payment list.
- 11.In package "dto", in class "AddPersonData", create person data and use it in main test.
- 12.Create "CreateOrderTest" to run the test.
- 13.In "CheckoutPage" create method, which verify that order has been created.
