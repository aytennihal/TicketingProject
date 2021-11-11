package com.ticketProject.step_definitions;

import com.ticketProject.pages.AdministrationPage;
import com.ticketProject.pages.BasePage;
import com.ticketProject.pages.LoginPage;
import com.ticketProject.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.ticketProject.utilities.Driver;


import java.nio.charset.Charset;

public class UserListStepDef {

    AdministrationPage administrationPage = new AdministrationPage();
    LoginPage loginPage = new LoginPage();

    String newUserName = "";
    String emailName = "";
    String password = "";
    String name = "";


    @When("user enter user credentials that is previously created")
    public void user_enter_user_credentials_that_is_previously_created() {

    }


    @Then("user should see {string} message")
    public void user_should_see_message(String string) {


    }

    @When("user navigates to {string} tab")
    public void user_navigates_to_tab(String string) {

    }

    @When("user enter {string} to the First Name")
    public void user_enter_to_the_First_Name(String firstName) {

        new AdministrationPage().firstNameButton.sendKeys(firstName);

    }

    @When("user enter {string} to the Last Name")
    public void user_enter_to_the_Last_Name(String lastName) {

        new AdministrationPage().lastNameButton.sendKeys(lastName);
        if (lastName != null) {
            Assert.assertEquals(lastName, administrationPage.lastNameButton.getText());
        }

    }

    @When("user enter {string} to the Email Adress")
    public void user_enter_to_the_Email_Adress(String emailAdress) {

        if (emailAdress.contains("@")) {
            new AdministrationPage().emailAdressButton.sendKeys(emailAdress);
        } else System.out.println("Please enter email adress!");

    }

    @When("user enter {string} to the Password")
    public void user_enter_to_the_Password(String string) {


    }

    @When("user enter {string} to the Password Confirmation")
    public void user_enter_to_the_Password_Confirmation(String string) {

    }


    @Then("user should be able to see new user under the User List")
    public void user_should_be_able_to_see_new_user_under_the_User_List() {
        BrowserUtils.waitFor(1);

    }

    @When("user click {string} button next to selected user")
    public void user_click_button_next_to_selected_user(String string) {

    }

    @Then("user should not see that user in user list anymore")
    public void user_should_not_see_that_user_in_user_list_anymore() {

    }


    @And("user enter {string} on the First Name")
    public void userEnterOnTheFirstName(String newName) {

        administrationPage.firstNameButton.sendKeys(newName);
    }

    @Then("user should see updated name of user in user list")
    public void userShouldSeeUpdatedNameOfUserInUserList() {

        String previousName = name;
        String newName = "";

    }

    @When("user click {string}")
    public void userClick(String button) {

        switch (button) {
            case "Save":
                administrationPage.saveButton.click();
                break;
            case "Navbar Toggle Icon":
                administrationPage.togglerIcon.click();
                break;
            case "User Create":
                administrationPage.userCreateButton.click();
                break;
            //  case "delete":
            //    administrationPage.deleteButton.click();
            //    break;
            //case "update":
            //     administrationPage.updateButton.click();
            ///    break;
        }
    }

    @When("user click update button next to user {string}")
    public void userClickButtonNextToUser(String emailName) {

        administrationPage.selectedUserUpdate(emailName).click();
    }

    @And("user select a {string}")
    public void userSelectA(String gender) {
        Driver.get().findElement(By.xpath("//*[@name='gender'][@value='" + gender + " ']")).click();

    }

    @And("user select {string}")
    public void userSelect(String role) {

        administrationPage.roleButton.click();
        Driver.get().findElement(By.xpath("//*[@class='custom-select']//*[contains(text(),'" + role + "')]")).click();


    }

    @And("user enter {string} to the Phone Number")
    public void userEnterToThePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            administrationPage.phoneNumber.sendKeys(phoneNumber);
        } else System.out.println("Please enter correct phone number");
    }

    @Then("user should be able to see new user with {string} under the User List")
    public void userShouldBeAbleToSeeNewUserWithUnderTheUserList(String emailAdress) {

        //String expect=emailAdress;
        //BrowserUtils.waitFor(3);
        //String actual="";
        //for(int a=0;a<administrationPage.userList.size();a++){
        //  actual=administrationPage.userList.get(a).getText();

        //}
        //Assert.assertEquals(expect,actual);
        // System.out.println("New user created");


        Assert.assertTrue("Verify that new user is created",
                administrationPage.selectedUser(emailAdress).isDisplayed());


    }

    @When("user click delete button next to user {string}")
    public void userClickDeleteButtonNextToUser(String deleteEmail) {

        administrationPage.selectedUserDelete(deleteEmail).click();
    }

    @Then("user should see updated name {string}  user list")
    public void userShouldSeeUpdatedNameUserList(String newName) {

    }

    @Given("user logged in")
    public void userLoggedIn() {

     loginPage.login.click();
    }


    @And("user navigates to Administration")
    public void userNavigatesToAdministration() {
        administrationPage.administrationTab.click();

    }
}
