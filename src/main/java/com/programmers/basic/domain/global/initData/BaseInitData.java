package com.programmers.basic.domain.global.initData;

import com.programmers.basic.domain.wiseSaying.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class BaseInitData {
    private final WiseSayingService wiseSayingService;

    @Bean
    public ApplicationRunner baseInitDataApplicationRunner() { //ApplicationRunner 타입의 빈은 스프링부트가 해당 빈을 수집하자마자 바로 실행한다. 주로 샘플 데이터 생성하는 용도로 사용
        return args -> {
            wiseSayingService.write("삶이 있는 한 희망은 있다.", "키케로");
            wiseSayingService.write("하루하루를 소중히 여기며 살아가자.", "무명");
            wiseSayingService.write("행복은 습관이다, 그것을 몸에 지니라.", "허버드");
        };
    }

    @Bean
    public List<Integer> ages() {
        return List.of(10, 20, 30, 40, 50);
    }
}
