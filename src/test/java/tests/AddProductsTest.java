package tests;


import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataDrivenTestRunner.class)
public class AddProductsTest extends BaseTest {

    @Test
    @DataLoader(filePaths = "src/test/java/resources/data.csv", loaderType = LoaderType.CSV)
    public void buyProduct(@Param(name = "type") String productType,
                           @Param(name = "expected") String expectedSum) {
        getBo().buyTheMostExpensiveProduct(getHomePage(), getProductPage(), getSearchResultPage(), productType, expectedSum);
    }
}
