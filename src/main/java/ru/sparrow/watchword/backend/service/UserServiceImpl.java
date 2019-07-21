package ru.sparrow.watchword.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sparrow.watchword.backend.dto.UserDto;
import ru.sparrow.watchword.backend.entity.UserEntity;
import ru.sparrow.watchword.backend.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto getUserById(Long id) {
        UserEntity entity = userRepository.findById(id).orElse(null);
        return UserDto.from(entity);
    }
}
