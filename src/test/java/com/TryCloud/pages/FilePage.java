package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {
    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement leftTopCheckBox;


    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesBtn;

    @FindBy (xpath = "(//span[@class='icon icon-more'])[4]")
    public WebElement threeDot;


    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement AddToFavorite;

    @FindBy(xpath = "//table[@id='filestable']//tr[@data-id='30759']")
    public WebElement ExpectedFavorite;

    @FindBy(xpath = "//table[@id='filestable']//tr[@data-id='27416']")
    public WebElement actualFavorite;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsBtn;

    @FindBy (id = "commentsTabView")
    public WebElement commentsBtn;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement inputCommentBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitBtn;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement postMessageText;

    @FindBy(xpath = "//table[@id='filestable']//tbody//tr/td//input")
    public List<WebElement> allCheckBox;

}
