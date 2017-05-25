package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * <p>Title:UserDaoImpl</p>
 * <p>Description:dao接口实现类</p>
 *
 * @Author:黄飞龙
 * @Date: Created in 18:00 2017/3/16
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

    @Override
    public User findUserById(int id) throws Exception {
        //继承SqlSessionDaoSupport，通过this.getSqlSession()的到SqlSession
        SqlSession sqlSession = this.getSqlSession();

        User user = sqlSession.selectOne("test.findUserById",id);

        return user;
    }

}
