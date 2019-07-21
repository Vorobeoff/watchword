package ru.sparrow.watchword.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sparrow.watchword.backend.dto.WatchwordDto;
import ru.sparrow.watchword.backend.service.WatchwordService;

import java.util.List;

@RestController
@RequestMapping("/watchword")
@RequiredArgsConstructor
public class WatchwordController {
    private final WatchwordService service;

    @GetMapping("/all")
    public List<WatchwordDto> getWatchwords() {
        return service.getWatchwords();
    }
}
