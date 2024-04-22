

import java.util.Scanner;
import javax.swing.*;

public class Main {
            public static void main(String[] args) {
                new EcommerceGUI();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to the E-commerce system!");

                System.out.println("Please enter your id");
                int customerId = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter your name");
                String name = scanner.nextLine();
                System.out.println("Please enter your address");
                String address = scanner.nextLine();

                Customer customer = new Customer(customerId, name, address);

                ElectronicProduct electronicProduct = new ElectronicProduct(1, "smartphone", 599.9F, "Samsung", 1);
                ClothingProduct clothingProduct = new ClothingProduct(2, "T-shirt", 19.99F, "Medium", "Cotton");
                BookProduct bookProduct = new BookProduct(3, "OOP", 39.99F, "O'Reilly", "X Publications");

                System.out.println("How many products you want to add to your cart?");
                int nProducts = scanner.nextInt();
                Cart cart = new Cart(customerId, nProducts);

                for (int i = 0; i < nProducts; i++) {
                    System.out.println("Enter details for product " + (i + 1) + ":");
                    System.out.println("1.smartphone ");
                    System.out.println("2.T-shirt ");
                    System.out.println("3.OOP ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            cart.addProduct(electronicProduct, i);
                            break;
                        case 2:
                            cart.addProduct(clothingProduct, i);
                            break;
                        case 3:
                            cart.addProduct(bookProduct, i);
                            break;
                        default:
                            System.out.println("Invalid choice. Product not added.");
                    }
                }
                double totalPrice = cart.calculatePrice();


                System.out.println("Would you like to remove a product from your cart? 1- Yes 2-No ");
                int o = scanner.nextInt();
                if (o ==1) {
                    System.out.println("Enter the number of productId you want to remove");
                    int productId = scanner.nextInt();
                    Cart.removeProduct(productId);

                    System.out.println("product remove successfully");
                }else {
                    System.out.println("No products were remove");
                }


                System.out.println("Your total is $" +  cart.calculatePrice()  + ". Would you like to place the order? 1- Yes 2-No");
                int option = scanner.nextInt();
                if (option == 1) {
                    cart.placeOrder();
                    Order order = new Order(customerId, 1, cart.getProducts(), totalPrice);
                }
                Order.printOrderInfo();




                }
            }



