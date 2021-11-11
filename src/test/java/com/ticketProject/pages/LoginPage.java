package com.ticketProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    public WebElement login;

}
