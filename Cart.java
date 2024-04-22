public class Cart {
    private int customerId;
    private static int nProducts;
    private static Product[] products;

    public Cart() {
    }

    public Cart(int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product product, int i) {

        if (i >= 0 && i < nProducts) {
            products[i] = product;
        }
    }

    public static float removeProduct(int productId) {
        if (productId >= 0 && productId < nProducts) {
            for (int i = productId; i < nProducts - 1; i++) {
                products[i] = products[i + 1];
            }
            products[nProducts - 1] = null;
            nProducts--;

        } else {
            System.out.println("Invalid productId. Product not removed.");
        }
        return 0;
    }


        public float calculatePrice(){
            float totalPrice=0;
            for(int i =0; i<nProducts;i++){
                totalPrice+= products[i].getPrice();
            }
            return totalPrice;
        }





    public void placeOrder() {
        System.out.println("Order placed successfully for customer ID: " + customerId);

    }



}
