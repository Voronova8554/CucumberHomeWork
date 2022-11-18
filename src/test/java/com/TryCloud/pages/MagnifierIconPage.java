package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagnifierIconPage {
    public MagnifierIconPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='material-design-icon magnify-icon unified-search__trigger']")
    public WebElement magnifierIconBtn;

    @FindBy(xpath = "//ul[@class='unified-search__results unified-search__results-files']/li")
    public WebElement nameAfterSearch;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement inputSearchMagnifierBox;

}
