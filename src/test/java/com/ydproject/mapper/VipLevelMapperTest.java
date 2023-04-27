package com.ydproject.mapper;

import com.ydproject.entity.Costomer;
import com.ydproject.entity.CostomerFactory;
import com.ydproject.entity.VipLevel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class VipLevelMapperTest {
    private SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

    private SqlSessionFactory factory = null;

    private SqlSession session = null;

    private AbstractApplicationContext context = null;

    @Before
    public void before() throws IOException {
        factory = builder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        session = factory.openSession();
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @After
    public void after(){
//        session.commit();
//        session.close();
    }

    @Test
    public void selectById() {
        CostomerMapper bean = session.getMapper(CostomerMapper.class);
        List<Costomer> costomers = bean.selectByVid(1);
        costomers.forEach(System.out::println);
        System.err.println("=====================");

        VipLevelMapper mapper = session.getMapper(VipLevelMapper.class);
        VipLevel vipLevel = mapper.selectById(1);
        System.out.println("vipLevel = " + vipLevel);
        System.err.println("==================================");

        Costomer factory1 = (Costomer) context.getBean("factory");
        System.out.println("factory1 = " + factory1);
        System.out.println("==================================");
        Costomer costomer1 = (Costomer) context.getBean("costomer1");
        System.out.println("'costomer1' = " + costomer1);
    }
}