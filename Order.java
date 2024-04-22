public class Order {

    private static int customerId;
    private static int orderId;
    private static Product[] products;
    private static double totalPrice;

    public Order() {
    }

    public Order(int customerId, int orderId, Product[] products, double totalPrice) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        Math.abs(customerId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        Math.abs(orderId);
    }

    public Product[] getProducts() {

        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        Math.abs(totalPrice);
    }

    public static void printOrderInfo() {
        System.out.println("Here`s your order`s summary:");
        System.out.println("order ID:" + orderId);
        System.out.println("customerId" + customerId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }

        System.out.println("TotalPrice" + totalPrice);


    }
}
