package my.springboot.service;

import my.springboot.entity.TodoEntity;
import my.springboot.entity.UserEntity;
import my.springboot.model.Todo;
import my.springboot.repository.TodoRepo;
import my.springboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;


    public Todo createTodo(TodoEntity todo, Long userId){
        UserEntity user =  userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id){
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.isCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }

}
