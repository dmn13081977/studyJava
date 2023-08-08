package my.springboot.controllers;

import my.springboot.entity.TodoEntity;
import my.springboot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity createTodo(@RequestBody TodoEntity todo, @RequestParam Long userId){

        try {
               return ResponseEntity.ok(todoService.createTodo(todo, userId));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping
    public ResponseEntity complete(@RequestParam Long id){

        try {
            return ResponseEntity.ok(todoService.complete(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

}
