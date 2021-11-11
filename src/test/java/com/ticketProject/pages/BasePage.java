package com.ticketProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.charset.Charset;
import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "//*[@class='navbar-toggler-icon']")
    public WebElement togglerIcon;

    @FindBy(xpath = "//*[@class='nav-link active']")
    public WebElement administrationTab;

    @FindBy(xpath = "//*[@class='nav-link'][contains(text(),'User Create')]")
    public WebElement userCreateButton;

    @FindBy(xpath = "//*[@class='nav-link'][contains(text(),'Project Create')]")
    public WebElement projectCreateButton;


}
