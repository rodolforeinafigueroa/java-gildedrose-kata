package tv.codely.kata.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class GildedRoseShould {
    private List<Item> arrayWith(Item item) {
        return Arrays.asList(item);
    }

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateverItem = ItemFactory.createBasedOn("whatever", 10, 0);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.sellIn(), 9);
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateverItem = ItemFactory.createBasedOn("whatever", 1, 10);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality(), 9);
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateverItem = ItemFactory.createBasedOn("whatever", 0, 10);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality(), 8);
    }

    @Test
    public void testThatQualityIsNeverNegative() {
        Item whateverItem = ItemFactory.createBasedOn("whatever", 0, 0);

        GildedRose gildedRose = new GildedRose(arrayWith(whateverItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality(), 0);
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = ItemFactory.createBasedOn("Aged Brie", 5, 1);

        GildedRose gildedRose = new GildedRose(arrayWith(agedBrie));
        gildedRose.updateQuality();

        assertEquals(agedBrie.quality(), 2);
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item agedBrie = ItemFactory.createBasedOn("Aged Brie", 5, 50);

        GildedRose gildedRose = new GildedRose(arrayWith(agedBrie));
        gildedRose.updateQuality();

        assertEquals(agedBrie.quality(), 50);
    }

    @Test
    public void testSulfurasNeverChanges() {
        Item sulfuras = ItemFactory.createBasedOn("Sulfuras, Hand of Ragnaros", 0, 25);

        GildedRose gildedRose = new GildedRose(arrayWith(sulfuras));
        gildedRose.updateQuality();

        assertEquals(sulfuras.quality(), 25);
        assertEquals(sulfuras.sellIn(), 0);
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item backstagePasses = ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 11, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality(), 21);
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item backstagePasses = ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 6, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality(), 22);
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item backstagePasses = ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 5, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality(), 23);
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item backstagePasses = ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 0, 20);

        GildedRose gildedRose = new GildedRose(arrayWith(backstagePasses));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality(), 0);
    }
}
