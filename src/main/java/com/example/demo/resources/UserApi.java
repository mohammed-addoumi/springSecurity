package com.example.demo.resources;

import com.example.demo.model.Response;
import com.example.demo.model.User;
import com.example.demo.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<Response> getUsers(){
        return ResponseEntity.ok(
            Response.builder()
                    .data(Map.of("users",userService.getAllUsers()
                            ))
                    .status(OK).build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getUserById(@PathVariable Long id){
        User user = userService.getAllUsers().stream().filter((user1 -> user1.getId() == id))
                .findFirst()
                .orElseThrow();
        return ResponseEntity.ok(
                Response.builder()
                        .data(Map.of("user",user
                        ))
                        .status(OK).build()
        );
    }

    @PostMapping("/add")
    public ResponseEntity<Response> addUser(@RequestBody User user){
        System.out.println("user" + user);
        System.out.println(userService.getAllUsers());
        return ResponseEntity.ok(
                Response.builder()
                        .data(Map.of("user",user
                        ))
                        .status(OK).build()
        );
    }
}
