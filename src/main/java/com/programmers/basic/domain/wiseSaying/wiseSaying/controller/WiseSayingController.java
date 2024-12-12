package com.programmers.basic.domain.wiseSaying.wiseSaying.controller;

import com.programmers.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.programmers.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/wiseSayings/write")
    public WiseSaying write(
            // ? 뒤의 content 파라미터 값이 들어온다.
            @RequestParam(name = "content") String content,
            // ? 뒤의 author 파라미터 값이 들어온다.
            @RequestParam(name = "author") String author
    ) {
        return wiseSayingService.write(content, author);
    }
}
