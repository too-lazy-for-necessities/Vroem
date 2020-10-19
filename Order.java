package be.intecbrussel.MiniautoverkoopzaakVroem.model;

import java.time.LocalDate;

public class Order {

    private int orderNumber;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    // public enum STATUS;
    private String comments;
    private int customerNumber;


    public Order(int orderNumber, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, String comments, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.customerNumber = customerNumber;
    }

    public Order() {
    }
}
