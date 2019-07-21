package ru.sparrow.watchword.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sparrow.watchword.backend.dto.UserDto;
import ru.sparrow.watchword.backend.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/{id}")
    public UserDto getUserDto(@PathVariable Long id) {
        return service.getUserById(id);
    }
}
