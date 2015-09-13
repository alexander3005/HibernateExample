package Dao;

/**
 * Created by Acer on 13.09.2015.
 */
public class Factory {


        private static UserDao userDao = null;
        private static Factory instance = null;

        public static synchronized Factory getInstance(){
            if (instance == null){
                instance = new Factory();
            }
            return instance;
        }

        public UserDao getUserDao(){
            if (userDao == null){
                userDao = new UserDaoImpl();
            }
            return userDao;
        }
    }

