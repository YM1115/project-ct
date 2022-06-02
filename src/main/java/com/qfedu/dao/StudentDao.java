package com.qfedu.dao;

import com.qfedu.entity.student;

import java.security.PrivateKey;
import java.util.List;

/**
 * ClassName:StudentDao
 * date：2022/5/25 21:18
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public interface StudentDao {
    public List<student> selectStudenById(int stuClass);
}
