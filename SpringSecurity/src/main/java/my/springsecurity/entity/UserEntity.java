package my.springsecurity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "userEntity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private ERole role = ERole.USER;
}
