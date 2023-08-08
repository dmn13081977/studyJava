package my.springboot.controllers;

import my.springboot.entity.UserEntity;
import my.springboot.exception.UserAlreadyExistException;
import my.springboot.exception.UserNotfoundException;
import my.springboot.repository.UserRepo;
import my.springboot.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("User save");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }


    @GetMapping
    public ResponseEntity getOneUsers(@RequestParam Long id){

        try {
            return ResponseEntity.ok(userService.getOne(id));
        } catch (UserNotfoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        try {
            return ResponseEntity.ok(userService.delete(id));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

}
