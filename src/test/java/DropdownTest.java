import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DropdownPage;


import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void testDropdown() {
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.SelectDropdownOption("Option 1");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assert is selected?
        assertTrue(!dropdownPage.getSelectedOption().contains("Please select an option"),"Option not selected");

    }
    @Test
    public void testOptionDropdown() {
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.SelectDropdownOption("Option 1");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assert is Option 1?
        assertTrue(dropdownPage.getSelectedOption().contains("Option 1"),"Incorrect Option");
    }
}
