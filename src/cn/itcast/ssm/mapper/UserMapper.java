package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;



/**
 * mapper接口，相当于dao接口，用户管理
 *
 * @Author:黄飞龙
 * @Date: Created in 20:55 2017/3/16
 */
public interface UserMapper {

    //根据id查询用户信息
    public User findUserById(int id) throws Exception;


}
