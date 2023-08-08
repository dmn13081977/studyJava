package my.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")//если названия поля класса и столбца таблицы совпадают, их можно не писать (@Column)
    private String title;

    @Column
    private boolean completed;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;


    public TodoEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
