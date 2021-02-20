package tv.codely.kata.gildedrose;

import java.util.List;
import java.util.Arrays;

public class GildedRoseCliEntryPoint {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        List<Item> items = Arrays.asList(ItemFactory.createBasedOn("+5 Dexterity Vest", 10, 20), //
                ItemFactory.createBasedOn("Aged Brie", 2, 0), //
                ItemFactory.createBasedOn("Elixir of the Mongoose", 5, 7), //
                ItemFactory.createBasedOn("Sulfuras, Hand of Ragnaros", 0, 80), //
                ItemFactory.createBasedOn("Sulfuras, Hand of Ragnaros", -1, 80),
                ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                ItemFactory.createBasedOn("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                ItemFactory.createBasedOn("Conjured Mana Cake", 3, 6));

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
