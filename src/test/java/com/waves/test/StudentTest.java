package com.waves.test;

import com.waves.domain.Address;
import com.waves.domain.Student;
import com.waves.domain.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 9:46
 */
public class StudentTest {

    String resource = "applicationContext.xml";
    @Test
    public void test01() {
        Student student = new Student();
        System.out.println("new Student() ==========>"+student);
    }

    @Test
    public void test02() {

        ApplicationContext app = new ClassPathXmlApplicationContext(resource);
        Student student = (Student) app.getBean("student");
        System.out.println("Spring ========>"+student);
    }

    @Test
    public void test03() {
        ApplicationContext app = new ClassPathXmlApplicationContext(resource);
        Address address = (Address) app.getBean("address");
        System.out.println("Spring ========>"+address);
    }
    @Test
    public void test04() {
        ApplicationContext app = new ClassPathXmlApplicationContext(resource);
        Teacher teacher = (Teacher) app.getBean("teacher");
        System.out.println("Spring ========>"+teacher);
    }

    @Test
    public void test05() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(resource));
        Student student = (Student) beanFactory.getBean("student");
        System.out.println(student);

    }

    @Test
    public void test06() {
        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\spring_workspace\\spring_demo_001\\src\\main\\resources\\applicationContext.xml");
        Address address = (Address) app.getBean("address");
        System.out.println("Spring ========>"+address);
    }


    @Test
    public void test07() {

    }
}
