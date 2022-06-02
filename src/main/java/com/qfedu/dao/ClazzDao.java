package com.qfedu.dao;

import com.qfedu.entity.Clazz;

/**
 * ClassName:ClazzDao
 * date：2022/5/25 21:20
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public interface ClazzDao {
    public Clazz selectClazzById(int cId);
}
