package ru.sparrow.watchword.backend.dto;

import lombok.Builder;
import lombok.Data;
import ru.sparrow.watchword.backend.entity.WatchwordEntity;

import java.util.UUID;

@Data
@Builder
public class WatchwordDto {
    private UUID id;

    public static WatchwordDto fromEntity(WatchwordEntity entity) {
        return WatchwordDto
                .builder()
                .id(entity.getId())
                .build();
    }
}
