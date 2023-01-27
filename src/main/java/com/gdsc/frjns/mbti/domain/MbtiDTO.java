package com.gdsc.frjns.mbti.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MbtiDTO {
    private String sourceMbti;
    private String targetName;
    private String imageUrl;
    private String content;
}
