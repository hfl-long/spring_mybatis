package cn.itcast.ssm.po;

/**
 * @Author:黄飞龙
 * @Date: Created in 12:29 2017/3/21
 */
public class Orderdetail {
    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;
    //明细对应的商品信息
    private Items items;


    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }


}
