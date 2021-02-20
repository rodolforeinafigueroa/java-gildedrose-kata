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
                    item.increaseQuality();
                    item.decreaseSellIn();
                    if (item.sellIn() < 0) {
                        item.increaseQuality();
                    }
                    break;
                case BACKSTAGE_ITEM:
                    item.increaseQuality();
                    if (item.sellIn() < 11) {
                        item.increaseQuality();
                    }

                    if (item.sellIn() < 6) {
                        item.increaseQuality();
                    }
                    item.decreaseSellIn();
                    if (item.sellIn() < 0) {

                        item.resetQuality();
                    }
                    break;
                case SULFURAS_ITEM:
                    break;
                default:
                    item.decreaseQuality();
                    item.decreaseSellIn();
                    if (item.sellIn() < 0) {
                        item.decreaseQuality();
                    }
            }

        }
    }

    
}
