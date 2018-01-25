package com.currentbp.service;

import com.currentbp.entry.Student;

/**
 * 学生业务
 *
 * @author current_bp
 * @createTime 20180124
 */
public interface StudentService {
    /**
     * 获取学生的描述
     *
     * @param student 学生
     * @return 描述
     */
    String getStudentDescription(Student student);

    String get2();
}
