package com.currentbp.service;

import com.currentbp.entry.Student;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;


/**
 * 学生业务
 *
 * @author current_bp
 * @createTime 20180124
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
//    @KSession("ksessionStudentRules")
//    private KieSession kSession;
    /**
     * 获取学生的描述
     *
     * @param student 学生
     * @return 描述
     */
    @Override
    public String getStudentDescription(Student student) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("studentSession");

        kieSession.insert(student);
        int fired = kieSession.fireAllRules();
        return student.getDescription();
    }

    @Override
    public String get2() {
        return "sssssssssssssssfffffffffffff";
    }
}
