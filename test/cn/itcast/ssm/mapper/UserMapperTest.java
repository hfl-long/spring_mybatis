package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:黄飞龙
 * @Date: Created in 21:01 2017/3/25
 */
public class UserMapperTest {

    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring
    @Before
    public void setUp() throws Exception {
       applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);

    }

}