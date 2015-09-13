package main;

import Dao.Factory;
import logic.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Acer on 13.09.2015.
 */
public class Main {
    public static void main(String [] args) throws SQLException {
        User user1= new User();
        User user2 = new User();
        user1.setName("Ivanov Ivan");
        user1.setAge((long) 21);
        user2.setName("Petrova Alisa");
        user2.setAge((long) 24);
        Factory.getInstance().getUserDao().addUser(user1);
        Factory.getInstance().getUserDao().addUser(user2);
        List<User> userList=Factory.getInstance().getUserDao().getAllUser();
        System.out.println(userList.get(0).getName()+""+userList.get(0).getAge());
    }
}
