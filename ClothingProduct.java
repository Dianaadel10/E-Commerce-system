public class ClothingProduct extends Product{
    private String size;
    private String fabric;
    public ClothingProduct(){}
    public ClothingProduct(int productId,String name,float price,String size,String fabric){
        super(productId,name,price);
        this.fabric=fabric;
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
