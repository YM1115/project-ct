package com.qfedu.dao;

import com.qfedu.entity.Students;

/**
 * ClassName:StudenDao
 * date：2022/5/13 10:07
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public interface StudenDao {
    //添加学生操作
    public int insertStudent(Students student);

    //删除学生操作
    public int deleteStudent(int sid);

    //修改学生操作
    public int updateStudent(Students student);


}
