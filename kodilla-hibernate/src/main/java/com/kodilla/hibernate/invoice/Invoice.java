package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {}

    public Invoice(String number) {
        this.number = number;
    }

   @Id
   @GeneratedValue
   @NotNull
   @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "INVOICE_NUMBER", unique = true)
    public String getNumber() {
        return number;
    }


    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER

    )

    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
