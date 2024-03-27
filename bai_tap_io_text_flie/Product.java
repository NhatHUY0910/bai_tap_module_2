package bai_tap_io_text_flie;

public class Product {
    private String productID;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String productID, String name, double price, String manufacturer, String description) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm: {" +
                "mã sản phẩm ='" + productID + '\'' +
                ", tên sản phẩm ='" + name + '\'' +
                ", giá =" + price + '\'' +
                ", hãng sản xuất ='" + manufacturer + '\'' +
                ", mô tả ='" + description + '\'' +
                '}';
    }
}

