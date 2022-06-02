package com.qfedu.dao;

import com.qfedu.entity.Clazz;
import com.qfedu.entity.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * ClassName:ClazzDaoTest
 * date：2022/5/25 21:35
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public class ClazzDaoTest {

    @Test
    public void selectClazzById() {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //以流的形式读取配置文件的信息
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = builder.build(is);

        SqlSession sqlSession = factory.openSession();
        ClazzDao dao = sqlSession.getMapper(ClazzDao.class);
        Clazz clazz = dao.selectClazzById(3);
        System.out.println(clazz);


    }
}