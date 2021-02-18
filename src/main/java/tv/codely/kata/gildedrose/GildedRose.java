package tv.codely.kata.gildedrose;

import java.util.List;

class GildedRose {
    List<Item> items;

    private static final String AGED_BRIE_ITEM = "Aged Brie";
    private static final String BACKSTAGE_ITEM = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_ITEM = "Sulfuras, Hand of Ragnaros";

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            switch (item.name) {
                case AGED_BRIE_ITEM:
                    increaseQuality(item);
                    decreaseSellIn(item);
                    if (item.sellIn < 0) {
                        increaseQuality(item);
                    }
                    break;
                case BACKSTAGE_ITEM:
                    increaseQuality(item);
                    if (item.sellIn < 11) {
                        increaseQuality(item);
                    }

                    if (item.sellIn < 6) {
                        increaseQuality(item);
                    }
                    decreaseSellIn(item);
                    if (item.sellIn < 0) {

                        resetQuality(item);
                    }
                    break;
                case SULFURAS_ITEM:
                    break;
                default:
                    decreaseQuality(item);
                    decreaseSellIn(item);
                    if (item.sellIn < 0) {
                        decreaseQuality(item);
                    }
            }

        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }

    private void resetQuality(Item item) {
        item.quality = 0;
    }

    private void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }
}
