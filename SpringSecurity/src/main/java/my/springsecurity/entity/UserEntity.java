package my.springsecurity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

@Entity
@Data
@ToString
@Table(name = "user_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private ERole role = ERole.USER;
}
