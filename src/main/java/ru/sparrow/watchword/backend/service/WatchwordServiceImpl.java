package ru.sparrow.watchword.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sparrow.watchword.backend.dto.WatchwordDto;
import ru.sparrow.watchword.backend.entity.WatchwordEntity;
import ru.sparrow.watchword.backend.repository.WatchwordRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WatchwordServiceImpl implements WatchwordService {
    private final WatchwordRepository watchwordRepository;

    @Override
    public List<WatchwordDto> getWatchwords() {
        LinkedList<WatchwordDto> res = new LinkedList<>();
        List<WatchwordEntity> watchwordEntities = watchwordRepository.findAll();
        watchwordEntities.forEach(e -> res.add(WatchwordDto.fromEntity(e)));
        return res;
    }
}
