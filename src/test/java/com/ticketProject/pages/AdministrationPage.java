package com.ticketProject.pages;

import org.openqa.selenium.WebDriver;
import com.ticketProject.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.util.resources.cldr.pt.CurrencyNames_pt_AO;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;

public class AdministrationPage extends BasePage {


    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameButton;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastNameButton;

    @FindBy(xpath = "//*[@id='emailaddress']")
    public WebElement emailAdressButton;

    @FindBy(xpath = "//*[@id='phonenumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='custom-select'][@id='role']")
    public WebElement roleButton;
    @FindBy(xpath = "//*[class='table table-striped']")
    public List<WebElement> userList;

    @FindBy(xpath = "//*[contains(text(),'Please enter last name.')]")
    public WebElement lastNameError;

    //@FindBy(xpath = "//*[@class='btn btn-primary btn-lg btn-block']")
    //@FindBy (xpath = "//*[contains(text(),'Sign in')]")
    //public WebElement login;




    public WebElement selectedUserUpdate(String emailname) {

        WebElement updatebutton;

        updatebutton = Driver.get().findElement(By.xpath("//*[@class='table-responsive']//*[@href='/admin/update/" + emailname + "']"));

        return updatebutton;

    }

    public WebElement selectedUser(String emailname) {

        WebElement selectedUser;

        selectedUser = Driver.get().findElement(By.xpath("//*[contains(text(),'" + emailname + "')]"));

        return selectedUser;
    }

    public WebElement selectedUserDelete(String emailname) {

        WebElement deletebutton;
        deletebutton = Driver.get().findElement(By.xpath("//*[@class='table-responsive']//*[@href='/admin/delete/" + emailname + "']"));
        return deletebutton;


    }
}