package com.qfedu;

import com.qfedu.dao.StudensDao;
import com.qfedu.entity.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * ClassName:Test
 * date：2022/5/13 14:36
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public class StudentsDaoTest {

    @Test
    public void test1() throws Exception{

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //以流的形式读取配置文件的信息
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);

        SqlSession sqlSession = factory.openSession();
        StudensDao mapper = sqlSession.getMapper(StudensDao.class);

        Students stu = new Students(20,1115,"王二狗","男",22);
        int i = mapper.insertStudent(stu);
        sqlSession.commit();
        sqlSession.clearCache();
        System.out.println(i);
    }


    @Test
    public  void test2(){


        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println(threadLocal.get());
    }

}
