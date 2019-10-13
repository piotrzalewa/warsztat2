package pl.coderslab;

import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User newUser = new User("admin", "admin@gmail.com", "admin");
//        System.out.println(newUser.toString());
//
//        userDao.create(newUser);
//        System.out.println(newUser.toString());

//        User readUser = userDao.read(1);
//        System.out.println(readUser);
//
//        User nonExistingUser = userDao.read(1000);
//        System.out.println(nonExistingUser);
//
//        readUser.setUserName("new username1");
//        userDao.update(readUser);
//
//        User updatedUser = userDao.read(1);
//        System.out.println(updatedUser);

//        User toBeDeleted = userDao.read(1);
//        System.out.println(toBeDeleted);
//
//        userDao.delete(toBeDeleted.getId());
//        //sprawdzamy
//        User deleted = userDao.read(1);
//        System.out.println(deleted);

        for (int i = 0; i < 5; i++) {
            userDao.create(
                    new User("user " + i,
                            "email" + i + "@gmail.com",
                            "haslo"));
        }
        User[] users = userDao.findAll();
        for (User user: users) {
            System.out.println(user);
        }
    }
}
