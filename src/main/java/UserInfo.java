import javax.persistence.*;

@Entity
@Table(name="UserInfo",schema = "", catalog = "javastudy")
public class UserInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userInfoId;
    @Column
    private Double growth;//рост
    @Column
    private Double weight;//вес
    @Column
    private Integer age;// возраст
    @Column()
    private Boolean sex;//род(м/ж)


    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
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

