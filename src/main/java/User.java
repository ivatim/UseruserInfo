import org.springframework.boot.CommandLineRunner;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="User",schema = "", catalog = "javastudy")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @Column(length = 100)
    private String userName;
    @OneToOne
    @JoinColumn (name = "userInfoId")
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

