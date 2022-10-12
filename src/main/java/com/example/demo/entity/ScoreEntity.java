package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("score")
@Data
public class ScoreEntity {
    @TableId("id")
    private Integer id;

    @TableField("score")
    private Integer score;
}
