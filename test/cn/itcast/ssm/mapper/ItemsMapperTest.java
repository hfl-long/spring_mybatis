package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:黄飞龙
 * @Date: Created in 11:20 2017/3/26
 */
public class ItemsMapperTest {

    private ApplicationContext applicationContext;

    private ItemsMapper itemsMapper;

    //setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
    }

    //根据主键删除
    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    //插入
    @Test
    public void insert() throws Exception {
        //构造items对象
        Items items = new Items();
        items.setName("苹果");
        items.setPrice(999f);
        itemsMapper.insert(items);


    }

    //自定义条件查询
    @Test
    public void selectByExample() throws Exception {
        ItemsExample itemsExample = new ItemsExample();
        //通过criteria构造查询条件
        ItemsExample.Criteria criteria = itemsExample.createCriteria();
        criteria.andNameEqualTo("电脑");
        //可能返回多条记录
        List<Items> list = itemsMapper.selectByExample(itemsExample);
        System.out.println(list);

    }

    //根据主键查询
    @Test
    public void selectByPrimaryKey() throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(1);
        System.out.println(items);
    }

    //更新数据
    @Test
    public void updateByPrimaryKey() throws Exception {

        //对所有字段进行更新，需要先查询出来再更新
        Items items = itemsMapper.selectByPrimaryKey(1);
        items.setName("飞龙");

        itemsMapper.updateByPrimaryKey(items);
        //如果传入字段不空才更新，在批量更新中使用此方法，不需要查询在更新
//        itemsMapper.updateByPrimaryKeySelective();
    }

}