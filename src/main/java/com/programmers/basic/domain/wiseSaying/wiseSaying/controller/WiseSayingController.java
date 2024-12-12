package com.programmers.basic.domain.wiseSaying.wiseSaying.controller;

import com.programmers.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.programmers.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getItems() {
        return wiseSayingService.findAll();
    }

    @GetMapping("/wiseSayings/write")
    public WiseSaying write(
            String content,
            @RequestParam(defaultValue = "무명") String author
    ) {
        return wiseSayingService.write(content, author);
    }

    @GetMapping("/wiseSayings/1")
    public WiseSaying getItem1() {
        Optional<WiseSaying> opWiseSaying = wiseSayingService.findById(1L);
        return opWiseSaying.get();
    }
    @GetMapping("/wiseSayings/2")
    public WiseSaying getItem2() {
        Optional<WiseSaying> opWiseSaying = wiseSayingService.findById(2L);
        return opWiseSaying.get();
    }
}
