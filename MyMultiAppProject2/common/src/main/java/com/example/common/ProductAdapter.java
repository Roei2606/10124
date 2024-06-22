package com.example.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;
    private Context context;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        private TextView name, priceRange, memoryRange, screenSize, weight, batteryLife, launchYear;
        private ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.product_name);
            priceRange = itemView.findViewById(R.id.product_price_range);
            memoryRange = itemView.findViewById(R.id.product_memory_range);
            screenSize = itemView.findViewById(R.id.product_screen_size);
            weight = itemView.findViewById(R.id.product_weight);
            batteryLife = itemView.findViewById(R.id.product_battery_life);
            launchYear = itemView.findViewById(R.id.product_launch_year);
            imageView = itemView.findViewById(R.id.product_image);
        }

        public void bind(Product product) {
            name.setText(product.getName());
            priceRange.setText(product.getPriceRange());
            memoryRange.setText(product.getMemoryRange());
            screenSize.setText(product.getScreenSize());
            weight.setText(product.getWeight());
            batteryLife.setText(product.getBatteryLife());
            launchYear.setText(product.getLaunchYear());
            Glide.with(context).load(product.getImageUrl()).into(imageView);
        }
    }
}
