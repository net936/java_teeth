package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@TableName("b_doctor")
public class Doctor implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title; // 名称
    @TableField
    public String zhicheng; // 职称
    @TableField
    public String description; // 简介

    @TableField
    public String cover;

    @TableField(exist = false)
    public MultipartFile imageFile;
}
