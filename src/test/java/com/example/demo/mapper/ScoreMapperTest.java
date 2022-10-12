package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.ScoreEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ScoreMapperTest {

    @Autowired
    private ScoreMapper scoreMapper;

    @Test
    void testList() {
        List<ScoreEntity> scoreEntities = scoreMapper.listAll();
        assert scoreEntities.size() > 0;
        scoreEntities = scoreMapper.selectList(new LambdaQueryWrapper<>());
        assert scoreEntities.size() > 0;
    }
}
