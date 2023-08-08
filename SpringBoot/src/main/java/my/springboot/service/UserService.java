package my.springboot.service;

import my.springboot.entity.UserEntity;
import my.springboot.exception.UserAlreadyExistException;
import my.springboot.exception.UserNotfoundException;
import my.springboot.model.User;
import my.springboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {

        if(userRepo.findByUsername(user.getUsername()) != null){
            throw new UserAlreadyExistException("Пользователь с таким именем уже существует");
        }
        return userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotfoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null){
            throw new UserNotfoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }

    public Long delete(Long id){
        userRepo.deleteById(id);
        return id;
    }

}
