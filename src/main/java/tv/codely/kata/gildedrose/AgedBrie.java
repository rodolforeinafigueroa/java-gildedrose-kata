package tv.codely.kata.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        decreaseSellIn();
        if (sellIn() < 0) {
            increaseQuality();
        }
    }
}