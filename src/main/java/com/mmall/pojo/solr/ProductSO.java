package com.mmall.pojo.solr;

import com.mmall.pojo.Product;
import org.apache.solr.client.solrj.beans.Field;

public class ProductSO {

    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String subtitle;

    public String getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    static public ProductSO getProductSO(Product product){
        ProductSO productSO = new ProductSO();
        productSO.setId(product.getId());
        productSO.setName(product.getName());
        productSO.setSubtitle(product.getSubtitle());

        return productSO;
    }

}
