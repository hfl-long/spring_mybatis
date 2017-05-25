package cn.itcast.ssm.po;

/**订单的扩展类
 * @Author:黄飞龙
 * @Date: Created in 17:05 2017/3/20
 */
//通过此类映射订单和用户查询的结果，让此类继承包括字段较多的pojo类
public class OrdersCustom extends Orders{

        //添加用户的属性
        /*
        * `user`.username,
				`user`.sex,
				`user`.address
        * */

    private String username;
    private String sex;
    private String address;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
