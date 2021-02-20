package tv.codely.kata.gildedrose;

public class BackstagePasses extends Item {

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        if (sellIn() < 11) {
            increaseQuality();
        }

        if (sellIn() < 6) {
            increaseQuality();
        }
        decreaseSellIn();
        if (sellIn() < 0) {

            resetQuality();
        }
    }
}