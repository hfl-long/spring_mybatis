package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:黄飞龙
 * @Date: Created in 19:21 2017/3/25
 */
public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        //调用userDao的方法

        User user = userDao.findUserById(1);

        System.out.println(user);
    }

}