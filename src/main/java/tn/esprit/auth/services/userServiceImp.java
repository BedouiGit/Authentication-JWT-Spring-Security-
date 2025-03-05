package tn.esprit.auth.services;

import org.springframework.stereotype.Service;
import tn.esprit.auth.entities.User;
import tn.esprit.auth.repositories.UserRepository;

import java.util.List;
@Service
public class userServiceImp implements userService{
    private final UserRepository userRepository;

    public userServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long idUser) {
        userRepository.deleteById(idUser);

    }

    @Override
    public User getUser(long idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

