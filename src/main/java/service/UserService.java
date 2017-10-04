package service;

import entity.User;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;



import static util.HibernateUtil.sessionFactory;

@Service("personService")
@Transactional
public class UserService {
    public void add(User user) {

        // Retrieve session from Hibernate
        // получаем сессию
        Session session = sessionFactory.getCurrentSession();

        // Save
        // сохраняем
        session.save(user);
    }
}
