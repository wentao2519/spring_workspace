package com.waves.domain;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/18 15:25
 */
public class Curriculum {
    private String curId;
    private String curName;

    public Curriculum() {
    }

    public Curriculum(String curId, String curName) {
        this.curId = curId;
        this.curName = curName;
    }

    public String getCurId() {
        return curId;
    }

    public void setCurId(String curId) {
        this.curId = curId;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "curId='" + curId + '\'' +
                ", curName='" + curName + '\'' +
                '}';
    }
}
