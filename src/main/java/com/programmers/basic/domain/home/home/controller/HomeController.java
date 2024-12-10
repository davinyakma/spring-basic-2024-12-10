package com.programmers.basic.domain.home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "안녕하세요.";
    }

    @GetMapping("/about")
    @ResponseBody
    public String showAbout() {
        return "저는 홍길동입니다.";
    }
}
