package tv.codely.kata.gildedrose;

abstract class Item {

    private ItemName name;

    private int sellIn;

    private int quality;

    public Item(final ItemName name, final int sellIn, final int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int sellIn() {
        return this.sellIn;
    }

    public int quality(){
        return quality;
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
