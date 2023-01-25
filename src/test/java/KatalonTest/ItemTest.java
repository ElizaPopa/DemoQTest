package KatalonTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemTest extends Base {
    @Test
    public void addItemsToCartAndViewCart() {
        items.addRandomItems();
        Assert.assertTrue(items.checkMyCart(), "The items I added are not present in the cart");
    }

    @Test
    public void searchForLowestPrice() {
        items.searchLowestPrice();
    }
}
