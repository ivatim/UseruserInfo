import org.springframework.boot.CommandLineRunner;

public class User {

    long userId;
    String userName;
    UserInfo userInfo;

public class UserInfo{

    private Double growth;//рост
    private Double weight;//вес
    private Integer age;// возраст
    private Boolean genus;//род(м/ж)

//setters

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGenus(Boolean genus) {
        this.genus = genus;
    }
//getters
    public Double getGrowth() {
        return growth;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getGenus() {
        return genus;
    }
}
}
