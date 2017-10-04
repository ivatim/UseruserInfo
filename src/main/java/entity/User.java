package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User  {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @Column(name = "userName", length = 100)
    private String userName;
    @OneToOne
    @JoinColumn(name = "userInfoId")
    private UserInfo userInfo;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}

