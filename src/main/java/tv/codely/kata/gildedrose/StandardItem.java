package tv.codely.kata.gildedrose;

public class StandardItem extends Item {

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseQuality();
        decreaseSellIn();
        if (sellIn() < 0) {
            decreaseQuality();
        }
    }
}