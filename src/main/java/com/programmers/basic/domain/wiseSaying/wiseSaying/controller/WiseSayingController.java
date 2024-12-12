package com.programmers.basic.domain.wiseSaying.wiseSaying.controller;

import com.programmers.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.programmers.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getItems() {
        return wiseSayingService.findAll();
    }
}
