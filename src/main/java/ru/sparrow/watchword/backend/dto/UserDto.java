package ru.sparrow.watchword.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.sparrow.watchword.backend.entity.UserEntity;

@Data
@AllArgsConstructor
public class UserDto {
    private long id;
    private String fullName;
    private String nickname;

    public static UserDto from(UserEntity entity) {
        if (entity == null)
            return null;
        return new UserDto(
                entity.getId(),
                entity.getFullName(),
                entity.getNickname()
        );
    }
}
