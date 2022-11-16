package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage {

    public TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement inputTalkSearchBox;

    @FindBy (xpath = "//span[@class='acli__content__line-one__title']")
    public List<WebElement> namesOfContact;

    @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement writeMessageBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement talkSubmitMesBtn;

    @FindBy (xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> messageList;



}
