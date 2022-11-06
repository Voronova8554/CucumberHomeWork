package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {
    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement leftTopCheckBox;


    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesBtn;

    @FindBy (xpath = "(//span[@class='icon icon-more'])[8]")
    public WebElement threeDot;
}
