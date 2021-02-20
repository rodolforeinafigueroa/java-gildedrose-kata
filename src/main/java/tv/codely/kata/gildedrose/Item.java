package tv.codely.kata.gildedrose;

public abstract class Item {

    public String name;

    private int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int sellIn() {
        return this.sellIn;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public abstract void update();

    public void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    public void increaseQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }

    public void resetQuality() {
        quality = 0;
    }

    public void decreaseSellIn() {
        sellIn -= 1;
    }
}
