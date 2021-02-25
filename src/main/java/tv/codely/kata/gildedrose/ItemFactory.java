package tv.codely.kata.gildedrose;

public class ItemFactory {

   

    static Item createBasedOn(final String rawName, int sellIn, int quality){
        ItemName name = new ItemName(rawName);

        if(name.isAgedBrie()) return new AgedBrie(name, sellIn, quality);
        if(name.isBackstagePasses()) return new BackstagePasses(name, sellIn, quality);
        if(name.isSulfuras()) return new Sulfuras(name, sellIn, quality);
        
        return new StandardItem(name, sellIn, quality);
                
    }
}