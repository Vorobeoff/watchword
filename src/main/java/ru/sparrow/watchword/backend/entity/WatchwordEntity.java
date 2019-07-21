package ru.sparrow.watchword.backend.entity;

import lombok.Getter;
import lombok.Setter;
import ru.sparrow.watchword.backend.dto.WatchwordDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "watchword")
public class WatchwordEntity {
    @Id
    private UUID id;

}
