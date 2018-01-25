package com.currentbp.entry;

import java.io.Serializable;

/**
 * 学生
 *
 * @author current_bp
 * @createTime 20180124
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 2563518533882518583L;
    private Integer id;
    private Integer sex;
    private Integer score;
    private String description;

    public Student() {
    }

    public Student(Integer id, Integer sex, Integer score) {
        this.id = id;
        this.sex = sex;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
