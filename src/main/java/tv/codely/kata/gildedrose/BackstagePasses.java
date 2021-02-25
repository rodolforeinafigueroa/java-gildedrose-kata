package tv.codely.kata.gildedrose;

final class BackstagePasses extends Item {

    private static final int DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 11;
    private static final int TRIPLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 6;
    private static final int QUALITY_RESET_SELL_IN_THRESHOLD = 0;

    public BackstagePasses(final ItemName name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();
        if (sellIn() < DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD) {
            increaseQuality();
        }

        if (sellIn() < TRIPLE_QUALITY_INCREASE_SELL_IN_THRESHOLD) {
            increaseQuality();
        }
        decreaseSellIn();
        if (sellIn() < QUALITY_RESET_SELL_IN_THRESHOLD) {

            resetQuality();
        }
    }
}