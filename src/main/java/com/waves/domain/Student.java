package com.waves.domain;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 9:18
 */
public class Student {
    private String name;
    private String sex;
    private Integer age;

    private Address address;

    public Student() {
        System.out.println("Student无参构造方法调用！！！");
        name = "Waves";
        sex = "男";
        age = 20;
    }

    public Student(String name, String sex, Integer age, Address address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
