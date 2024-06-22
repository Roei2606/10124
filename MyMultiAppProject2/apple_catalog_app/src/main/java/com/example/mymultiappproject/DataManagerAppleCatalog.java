package com.example.mymultiappproject;

import com.example.common.DataManagerBase;
import com.example.common.Product;

import java.util.ArrayList;

public class DataManagerAppleCatalog extends DataManagerBase {

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> AppleProducts = new ArrayList<>();
        Product product1 = new Product();
        product1.setName("iPhone 13");
        product1.setImageUrl("https://cdsassets.apple.com/live/SZLF0YNV/images/sp/111872_iphone13-colors-480.png");
        product1.setPriceRange("$799 - $1099");
        product1.setMemoryRange("128GB - 512GB");
        product1.setScreenSize("6.1\"");
        product1.setWeight("174g");
        product1.setBatteryLife("17 hours");
        product1.setLaunchYear("2021");
        AppleProducts.add(product1);

        Product product2 = new Product();
        product2.setName("iPhone 12");
        product2.setImageUrl("https://itronics.in/wp-content/uploads/2020/10/iphone-12-colors-e1619961306902.jpg");
        product2.setPriceRange("$699 - $999");
        product2.setMemoryRange("64GB - 256GB");
        product2.setScreenSize("6.1\"");
        product2.setWeight("162g");
        product2.setBatteryLife("15 hours");
        product2.setLaunchYear("2020");
        AppleProducts.add(product2);

        Product product3 = new Product();
        product3.setName("iPhone 11");
        product3.setImageUrl("https://www.imgshop.co.il/images/itempics/13841_18022023173414.jpg");
        product3.setPriceRange("$599 - $849");
        product3.setMemoryRange("64GB - 256GB");
        product3.setScreenSize("6.1\"");
        product3.setWeight("194g");
        product3.setBatteryLife("14 hours");
        product3.setLaunchYear("2019");
        AppleProducts.add(product3);

        return AppleProducts;

    }
}
