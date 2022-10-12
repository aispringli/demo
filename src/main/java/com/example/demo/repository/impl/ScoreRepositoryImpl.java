package com.example.demo.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.ScoreEntity;
import com.example.demo.mapper.ScoreMapper;
import com.example.demo.repository.ScoreRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreRepositoryImpl extends ServiceImpl<ScoreMapper, ScoreEntity> implements ScoreRepository {
}
