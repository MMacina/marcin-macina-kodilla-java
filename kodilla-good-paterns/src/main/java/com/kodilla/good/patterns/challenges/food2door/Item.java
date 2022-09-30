package com.kodilla.good.patterns.challenges.food2door;

public class Item {
    private final String itemName;
    private final double itemUnitePrice;

    public Item(final String itemName, final double itemUnitePrice) {
        this.itemName = itemName;
        this.itemUnitePrice = itemUnitePrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemUnitePrice() {
        return itemUnitePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.itemUnitePrice, itemUnitePrice) != 0) return false;
        return itemName.equals(item.itemName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = itemName.hashCode();
        temp = Double.doubleToLongBits(itemUnitePrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Item[" + itemName +
                ", Unite price:" + itemUnitePrice +
                " PLN]";
    }
}
