package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Supplier {
    private final String supplierName;
    private final String supplierEmail;
        private final List<Item> items;

    public Supplier(final String supplierName, String supplierEmail, final List<Item> items) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.items = items;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        return supplierName.equals(supplier.supplierName);
    }

    @Override
    public int hashCode() {
        return supplierName.hashCode();
    }

    @Override
    public String toString() {
        return "Supplier[" +
                supplierName +
                ", items:/" + items +
                "/]";
    }
}
