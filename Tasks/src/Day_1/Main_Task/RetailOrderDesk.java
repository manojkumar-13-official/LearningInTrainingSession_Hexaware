package Day_1.Main_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RetailOrderDesk {

    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== RETAIL ORDER DESK =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Update Order");
            System.out.println("5. Sort by Order ID");
            System.out.println("6. Sort by Customer Name");
            System.out.println("7. Sort by Product Name");
            System.out.println("8. Sort by Price");
            System.out.println("9. Binary Search");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addOrder();
                    break;

                case 2:
                    displayOrders();
                    break;

                case 3:
                    removeOrder();
                    break;

                case 4:
                    updateOrder();
                    break;

                case 5:
                    sortById();
                    break;

                case 6:
                    sortByCustomer();
                    break;

                case 7:
                    sortByProduct();
                    break;

                case 8:
                    sortByPrice();
                    break;

                case 9:
                    binarySearch();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }

    // Add Order
    static void addOrder() {
        int orderId = Integer.parseInt(sc.nextLine());
        String customerName = sc.nextLine();
        String productName = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double price = Double.parseDouble(sc.nextLine());
        orders.add(new Order(orderId,customerName,productName,quantity,price));
    }

    // Display Orders
    static void displayOrders() {
        for(Order ord:orders){
            System.out.println(ord.toString());
        }
    }

    // Remove Order
    static void removeOrder() {
        int removeOrderId = Integer.parseInt(sc.nextLine());
        boolean f = false;
        for(Order ord:orders){
            if(ord.orderId==removeOrderId){
                f = true;
                break;
            }
        }
        if(f){
            orders.remove(Collections.singleton(removeOrderId));
            System.out.println("Order Removed Successfully");
        }else{
            System.out.println("Order not presented");
        }
    }

    // Update Order
    static void updateOrder() {
        int updateOrderId = Integer.parseInt(sc.nextLine());
        Order tempOrd = null;
        for(Order ord:orders){
            if(ord.orderId==updateOrderId){
                tempOrd = ord;
                break;
            }
        }
        System.out.println("Which Filled you wants to Update : ");
        System.out.println("1 : CustomerName\n2 : ProductName\n3 : Quantity\n4 : Price");
        int option;
        do{
            option = Integer.parseInt(sc.nextLine());
            switch(option){
                case 1:
                    String customer = sc.nextLine();
                    tempOrd.setCustomerName(customer);
                    break;
                case 2:
                    String product = sc.nextLine();
                    tempOrd.setProductName(product);
                    break;
                case 3:
                    int quantity = Integer.parseInt(sc.nextLine());
                    tempOrd.setQuantity(quantity);
                    break;
                case 4:
                    double price = Double.parseDouble(sc.nextLine());
                    tempOrd.setPrice(price);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }while(option>=1 && option<=4);
    }

    // Sort by Order ID
    static void sortById() {

    }

    // Sort by Customer Name
    static void sortByCustomer() {

    }

    // Sort by Product Name
    static void sortByProduct() {

    }

    // Sort by Price
    static void sortByPrice() {

    }

    // Binary Search
    static void binarySearch() {

    }
}
class Order {

    int orderId;
    String customerName;
    String productName;
    int quantity;
    double price;

    Order(int orderId, String customerName,
          String productName, int quantity, double price) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return orderId + " " + customerName + " "
                + productName + " " + quantity + " " + price;
    }
}
