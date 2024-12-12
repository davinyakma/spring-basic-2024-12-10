package com.programmers.basic.domain.wiseSaying.wiseSaying.controller;

import com.programmers.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.programmers.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody // 여기에 붙이면 모든 메서드에 적용됨
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    public WiseSayingController() {
        this.wiseSayingService = new WiseSayingService();
    }

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getItems() {
        return wiseSayingService.findAll();
    }
}
