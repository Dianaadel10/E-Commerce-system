public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;
    public ElectronicProduct(){}
    public ElectronicProduct(int productId,String name,float price,String brand,int warrantyPeriod){
        super(productId,name,price);
        this.brand=brand;
        this.warrantyPeriod=warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        Math.abs(warrantyPeriod);
    }
}
