package com.programmers.basic.domain.global.initData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Base2InitData {
    @Bean
    public List<Integer> ages2(List<Integer> ages) { // List<Integer> ages 빈은 `BaseInitData` 에서 생성된다.
        return ages.reversed();
    }
}
