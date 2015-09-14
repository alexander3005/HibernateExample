package Dao;

import logic.User;
import org.hibernate.Session;
import util.HibernateUtil;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserDaoImpl implements  UserDao {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
try{
    session= HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(user);
    session.getTransaction().commit();
}catch (Exception e) {
    e.getMessage();
} finally {
    if (session != null && session.isOpen()) {
        session.close();
    }
}
    }

   

    @Override
    public List getAllUser() throws SQLException {
      Session session = null;
        List<User> users = new ArrayList<>();
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            users=session.createCriteria(User.class).list();
        }catch (Exception e) {
            e.getMessage();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return users;
    }

   
}
