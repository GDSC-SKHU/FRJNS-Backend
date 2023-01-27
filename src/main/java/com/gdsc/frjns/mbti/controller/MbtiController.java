package com.gdsc.frjns.mbti.controller;
import com.gdsc.frjns.mbti.domain.MbtiDTO;
import com.gdsc.frjns.mbti.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MbtiController {
    private final MbtiService mbtiService;

    @GetMapping("/mbti/{sourceMbti}")
    public ResponseEntity<List<MbtiDTO>> findAllByMbti(@PathVariable("sourceMbti")  String mbti){
        List<MbtiDTO> responses = mbtiService.findAllBySourceMbti(mbti.toUpperCase());

        if (responses.isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .build();
        }

        return ResponseEntity
                .ok(responses);        // 200 OK - 요청 성공
    }
}
