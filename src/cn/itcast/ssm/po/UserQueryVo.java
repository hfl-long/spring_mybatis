package cn.itcast.ssm.po;

import java.util.List;

/**
 * 包装类型
 *
 * @Author:黄飞龙
 * @Date: Created in 22:59 2017/3/18
 */
public class UserQueryVo {

    //传入多个id
    private List<Integer> ids;

    //在这里包装所需要的查询条件

    //用户查询条件
    private UserCustom userCustom;

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
//可以包装其它的查询条件，订单、商品
//...


    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
