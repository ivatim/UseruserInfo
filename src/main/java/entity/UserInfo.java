package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="UserInfo")
public class UserInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userInfoId;
    @Column(name = "height")
    private Double height;//рост
    @Column(name = "weight")
    private Double weight;//вес
    @Column(name = "age")
    private Integer age;// возраст
    @Column(name = "sex")
    private Boolean sex;//род(м/ж)


    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}

