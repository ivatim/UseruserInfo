package main;

import entity.SexEnum;
import entity.User;
import entity.UserInfo;
import org.hibernate.Session;
import util.HibernateUtil;

public class Main {
    public static void main(String args[]){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user1 = new User();
        UserInfo userInfo1 =new UserInfo();
        user1.setUserInfo(userInfo1);
        user1.setUserName("Ivan");
        user1.getUserInfo().setAge(24);
        user1.getUserInfo().setSex(SexEnum.MALE);

        session.save(userInfo1);
        session.save(user1);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
