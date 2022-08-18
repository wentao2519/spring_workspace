package com.waves.domain;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 9:18
 */
public class Teacher {
    private String name;
    private String sex;
    private Integer age;

    private Address address;

    public Teacher() {
        System.out.println("Student无参构造方法调用！！！");
        name = "Tom";
        sex = "男";
        age = 22;
    }

    public Teacher(String name, String sex, Integer age, Address address) {
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
