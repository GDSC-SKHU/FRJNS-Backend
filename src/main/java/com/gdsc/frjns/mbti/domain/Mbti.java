package com.gdsc.frjns.mbti.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@Entity
public class Mbti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String sourceMbti;

    @Column(nullable = false)
    private String targetName;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String content;

    public MbtiDTO toDTO() {
        return MbtiDTO.builder()
                .sourceMbti(sourceMbti)
                .targetName(targetName)
                .imageUrl(imageUrl)
                .content(content)
                .build();
    }
}
