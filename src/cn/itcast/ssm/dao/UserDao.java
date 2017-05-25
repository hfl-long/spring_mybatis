package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

/**
 * <p>Title: UserDao</p>
 * <p>Description:dao接口，用户管理</p>
 * @Author:黄飞龙
 * @Date: Created in 17:34 2017/3/16
 */
public interface UserDao {

    //根据id查询用户信息
    public User findUserById(int id) throws Exception;

}
