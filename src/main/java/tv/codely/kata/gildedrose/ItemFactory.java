package tv.codely.kata.gildedrose;

public class ItemFactory {

    private static final String AGED_BRIE_ITEM = "Aged Brie";
    private static final String BACKSTAGE_ITEM = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_ITEM = "Sulfuras, Hand of Ragnaros";

    public static Item createBasedOn(String name, int sellIn, int quality){
        switch(name){
            case AGED_BRIE_ITEM:
            return new AgedBrie(name, sellIn, quality);
            case BACKSTAGE_ITEM:
            return new BackstagePasses(name, sellIn, quality);
            case SULFURAS_ITEM:
            return new Sulfuras(name, sellIn, quality);
            default:
            return new StandardItem(name, sellIn, quality);
        }        
    }
}