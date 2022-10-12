package com.example.demo.repository;

import com.example.demo.entity.ScoreEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ScoreRepositoryTest {

    @Autowired
    private ScoreRepository scoreRepository;

    @Test
    void list() {
        List<ScoreEntity> list = scoreRepository.list();
        assert list.size() > 0;
    }
}
