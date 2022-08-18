package com.waves.domain;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 10:23
 */
public class Address {
    private String province;
    private String city;
    private String county;

    public Address() {
        System.out.println("Address无参构造方法调用！！！");
//        this.province = "山东省";
//        this.city = "临沂市";
//        this.county = "兰陵县";
    }

    public Address(String province, String city, String county) {
        this.province = province;
        this.city = city;
        this.county = county;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
