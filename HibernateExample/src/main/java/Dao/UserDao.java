package Dao;



import logic.User;

import java.sql.SQLException;
import java.util.List;


public interface UserDao {
    public void addUser(User user) throws SQLException;  
 

    public List getAllUser() throws SQLException;             
  
}