package KatalonTest;

import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;

public class ItemTest extends Base {
    @Test
    public void addItemsToCartAndViewCart() {
        items.addRandomItems();
        Assert.isTrue(items.checkMyCart(), "The items I added are not present in the cart");
    }

    @Test
    public void searchForLowestPrice() {
        items.searchLowestPrice();
    }
}
