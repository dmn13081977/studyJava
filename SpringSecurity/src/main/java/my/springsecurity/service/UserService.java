package my.springsecurity.service;

import lombok.AllArgsConstructor;
import my.springsecurity.entity.UserEntity;
import my.springsecurity.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    UserRepo userRepo;

    private BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public void saveUser(UserEntity userEntity) {
        userEntity.setPassword(encoder().encode(userEntity.getPassword()));
        userRepo.save(userEntity);
    }

    public List<UserEntity> getAll(){
        return userRepo.findAll();
    }

}
