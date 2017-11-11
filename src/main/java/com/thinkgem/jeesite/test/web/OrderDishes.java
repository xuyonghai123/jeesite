package com.thinkgem.jeesite.test.web;

import java.math.BigDecimal;
import java.util.List;

public class OrderDishes {

    // 就餐人数
    private int peopleNum;
    // 单个菜品
    private List<Dishes> variant;
    // 套餐
    private List<Dishes> product;
    // 商品总额
    private BigDecimal totalAmount;
    // 折扣金额
    private BigDecimal discountAmount;
    // 备注
    private String memo;
    // 是否推迟下单
    private boolean isPostpone;

    public OrderDishes(int peopleNum, List<Dishes> variant, List<Dishes> product, BigDecimal totalAmount, BigDecimal discountAmount, String memo, boolean isPostpone) {
        this.peopleNum = peopleNum;
        this.variant = variant;
        this.product = product;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.memo = memo;
        this.isPostpone = isPostpone;
    }

    @Override
    public String toString() {
        return "OrderDishes{" +
                "peopleNum=" + peopleNum +
                ", variant=" + variant +
                ", product=" + product +
                ", totalAmount=" + totalAmount +
                ", discountAmount=" + discountAmount +
                ", memo='" + memo + '\'' +
                ", isPostpone=" + isPostpone +
                '}';
    }

    public OrderDishes() {
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public List<Dishes> getVariant() {
        return variant;
    }

    public void setVariant(List<Dishes> variant) {
        this.variant = variant;
    }

    public List<Dishes> getProduct() {
        return product;
    }

    public void setProduct(List<Dishes> product) {
        this.product = product;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public boolean isPostpone() {
        return isPostpone;
    }

    public void setPostpone(boolean postpone) {
        isPostpone = postpone;
    }


}
class Dishes {
    private Long productID;
    private int quantity;
    private String memo;
    private BigDecimal addedPrice;

    public Dishes(){

    }

    public BigDecimal getAddedPrice() {
        return addedPrice;
    }

    public void setAddedPrice(BigDecimal addedPrice) {
        this.addedPrice = addedPrice;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
