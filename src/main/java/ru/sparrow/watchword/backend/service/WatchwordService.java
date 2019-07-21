package ru.sparrow.watchword.backend.service;

import ru.sparrow.watchword.backend.dto.WatchwordDto;
import ru.sparrow.watchword.backend.entity.WatchwordEntity;

import java.util.List;

public interface WatchwordService {
    List<WatchwordDto> getWatchwords();
}
