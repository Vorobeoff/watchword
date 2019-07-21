package ru.sparrow.watchword.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sparrow.watchword.backend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
