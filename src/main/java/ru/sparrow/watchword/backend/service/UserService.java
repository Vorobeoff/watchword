package ru.sparrow.watchword.backend.service;

import ru.sparrow.watchword.backend.dto.UserDto;

public interface UserService {
    UserDto getUserById(Long id);
}
