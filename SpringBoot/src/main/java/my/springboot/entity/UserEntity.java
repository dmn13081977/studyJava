package my.springboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "username")//если названия поля класса и столбца таблицы совпадают, их можно не писать (@Column)
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List <TodoEntity> todos;

    public UserEntity() {
    }

    public List<TodoEntity> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoEntity> todos) {
        this.todos = todos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
