package ru.sparrow.watchword.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sparrow.watchword.backend.entity.WatchwordEntity;

import java.util.UUID;

public interface WatchwordRepository extends JpaRepository<WatchwordEntity, UUID> {
}
