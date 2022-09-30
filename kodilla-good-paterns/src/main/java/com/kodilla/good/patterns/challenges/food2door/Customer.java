package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private final String customerName;
    private final String customerEmail;
    private final int customerPhone;
    private final String customerAddress;

    public Customer(final String customerName, final String customerEmail, final int customerPhone, final String custommerAddress) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = custommerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!customerName.equals(customer.customerName)) return false;
        return customerEmail.equals(customer.customerEmail);
    }

    @Override
    public int hashCode() {
        int result = customerName.hashCode();
        result = 31 * result + customerEmail.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer[" + customerName +
                ", Email: " + customerEmail +
                ", Phone:" + customerPhone +
                ", Address:" + customerAddress +
                ']';
    }
}
