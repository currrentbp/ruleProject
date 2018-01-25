package com.currentbp.service;

import com.currentbp.base.BaseTest;
import com.currentbp.entry.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author current_bp
 * @createTime 20180124
 */
public class StudentServiceTest extends BaseTest{
    private static final Logger logger= LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    public StudentService studentService;


    @Test
    public void getStudentDescription(){
        Student student = new Student(1, 2, 59);
        String description = studentService.getStudentDescription(student);
        logger.info("======================="+description);
    }

    @Test
    public void test2(){
        logger.info(studentService.get2());
    }


}
