package com.gdsc.frjns.mbti.repository;

import com.gdsc.frjns.mbti.domain.Mbti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MbtiRepository extends JpaRepository<Mbti, Long> {
    List<Mbti> findAllBySourceMbti(String mbti);
}
