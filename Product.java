public class Product {

private int productId;
private String name;
private float price;
public Product(){}
    public Product(int productId,String name,float price){
    this.productId=productId;
    this.name=name;
    this.price=price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int product) {
       if (product>0)
           product=productId;
       else
           Math.abs(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float p) {
        if (p>0)
            p=price;
        else
            Math.abs(p);

    }
}
