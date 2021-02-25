package tv.codely.kata.gildedrose;

final class AgedBrie extends Item {

    private static final int DOUBLE_QUALITY_DECREMENT_SELL_IN_THRESHOLD = 0;

    public AgedBrie(final ItemName name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        decreaseSellIn();
        if (sellIn() < DOUBLE_QUALITY_DECREMENT_SELL_IN_THRESHOLD) {
            increaseQuality();
        }
    }
}