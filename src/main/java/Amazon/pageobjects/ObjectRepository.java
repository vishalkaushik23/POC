package Amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
	WebDriver driver;

	public ObjectRepository(WebDriver driver) {
		this.driver = driver;
	}

	By accountList = By.xpath("//*[text()='Account & Lists']");
	By wishList = By.xpath("//*[text()='Create a Wish List']");
	By newReleases = By.xpath("//*[@data-csa-c-content-id=\"nav_cs_newreleases\"]");
	By searchBar = By.id("twotabsearchtextbox");
	By submitButton = By.id("nav-search-submit-button");
	By wishListLink = By.xpath("//*[text() = 'Create or view your Wish Lists.']");

	public By getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(By searchBar) {
		this.searchBar = searchBar;
	}

	public By getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(By submitButton) {
		this.submitButton = submitButton;
	}

	public By getWishListLink() {
		return wishListLink;
	}

	public void setWishListLink(By wishListLink) {
		this.wishListLink = wishListLink;
	}

	public By getAccountList() {
		return accountList;
	}

	public void setAccountList(By accountList) {
		this.accountList = accountList;
	}

	public By getWishList() {
		return wishList;
	}

	public void setWishList(By wishList) {
		this.wishList = wishList;
	}

	public By getNewReleases() {
		return newReleases;
	}

	public void setNewReleases(By newReleases) {
		this.newReleases = newReleases;
	}

}
