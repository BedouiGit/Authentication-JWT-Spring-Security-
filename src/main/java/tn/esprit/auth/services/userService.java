package tn.esprit.auth.services;
import java.util.List;
import tn.esprit.auth.entities.User;

public interface userService {
    User saveUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    List<User> getAllUsers();

}
