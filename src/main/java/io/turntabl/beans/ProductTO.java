package io.turntabl.beans;

public class ProductTO {
    private String product_name;
    private String unit_price;

    public ProductTO() {};

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getUnit_price() {
        return unit_price;
    }

    @Override
    public String toString() {
        return "product_name: " + product_name + " " +
               "unit_price: " + unit_price + "\n";
    }
}
