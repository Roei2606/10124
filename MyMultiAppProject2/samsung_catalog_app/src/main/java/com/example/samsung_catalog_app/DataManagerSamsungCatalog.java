package com.example.samsung_catalog_app;

import com.example.common.DataManagerBase;
import com.example.common.Product;

import java.util.ArrayList;

public class DataManagerSamsungCatalog extends DataManagerBase {

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> SamsungProducts = new ArrayList<>();
        Product product1 = new Product();
        product1.setName("Galaxy S21");
        product1.setImageUrl("https://the-lab.co.il/wp-content/uploads/2021/01/samsung-galaxy-s21-5g-2.jpg");
        product1.setPriceRange("$799 - $1199");
        product1.setMemoryRange("128GB - 512GB");
        product1.setScreenSize("6.2\"");
        product1.setWeight("169g");
        product1.setBatteryLife("18 hours");
        product1.setLaunchYear("2021");
        SamsungProducts.add(product1);

        Product product2 = new Product();
        product2.setName("Galaxy S20");
        product2.setImageUrl("https://i.ebayimg.com/thumbs/images/g/~T8AAOSwv5NkZbz0/s-l1200.jpg");
        product2.setPriceRange("$699 - $999");
        product2.setMemoryRange("128GB - 512GB");
        product2.setScreenSize("6.2\"");
        product2.setWeight("163g");
        product2.setBatteryLife("17 hours");
        product2.setLaunchYear("2020");
        SamsungProducts.add(product2);

        Product product3 = new Product();
        product3.setName("Galaxy S10");
        product3.setImageUrl("https://www.gadgety.co.il/wp-content/themes/main/thumbs/2019/02/Samsung-Galaxy-S10-main.jpg");
        product3.setPriceRange("$599 - $849");
        product3.setMemoryRange("128GB - 512GB");
        product3.setScreenSize("6.1\"");
        product3.setWeight("157g");
        product3.setBatteryLife("15 hours");
        product3.setLaunchYear("2019");
        SamsungProducts.add(product3);
        return SamsungProducts;
    }
}
