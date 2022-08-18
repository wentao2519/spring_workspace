package com.waves.domain;

import java.util.Arrays;
import java.util.List;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 9:18
 */
public class Student {
    private String name;
    private String sex;
    private Integer age;

    private List<Curriculum> curriculumList;
    private Address address;

    private String[] hobbyArray;

    public Student() {
        System.out.println("Student无参构造方法调用！！！");
        name = "Waves";
        sex = "男";
        age = 20;
        curriculumList=null;
        hobbyArray=null;
    }

    public Student(String name, String sex, Integer age, Address address,List<Curriculum> curriculumList,String[] hobbyArray) {
        System.out.println("Student有参构造方法调用！！！");
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.curriculumList=curriculumList;
        this.hobbyArray=hobbyArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Student的set方法调用！！！");
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Curriculum> getCurriculumList() {
        return curriculumList;
    }

    public void setCurriculumList(List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getHobbyArray() {
        return hobbyArray;
    }

    public void setHobbyArray(String[] hobbyArray) {
        this.hobbyArray = hobbyArray;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", curriculumList=" + curriculumList +
                ", address=" + address +
                ", hobbyArray=" + Arrays.toString(hobbyArray) +
                '}';
    }
}
