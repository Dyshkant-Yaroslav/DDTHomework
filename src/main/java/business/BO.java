package business;


import org.junit.Assert;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;


public class BO {
    private static final int DEFAULT_WAIT_TIME = 20000;

    public void buyTheMostExpensiveProduct(HomePage homePage, ProductPage productPage, SearchResultPage searchResultPage,
                                           String type, String expectedSum) {
        homePage.fillSearchInput(type);
        searchResultPage.defaultWaiters(DEFAULT_WAIT_TIME);
        searchResultPage.clickOnSortFromExpensiveToLowLink();
        searchResultPage.defaultWaiters(DEFAULT_WAIT_TIME);
        searchResultPage.clickOnFirstElementFromListOfProducts();
        searchResultPage.defaultWaiters(DEFAULT_WAIT_TIME);
        productPage.clickOnBuyButton();
        searchResultPage.defaultWaiters(DEFAULT_WAIT_TIME);
        Assert.assertTrue(productPage.getSumOFPriceInCartSumSpan().contains(expectedSum));
    }


}
