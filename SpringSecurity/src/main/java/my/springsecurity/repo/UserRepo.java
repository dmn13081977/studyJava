package my.springsecurity.repo;

import my.springsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <UserEntity, Long> {

}
