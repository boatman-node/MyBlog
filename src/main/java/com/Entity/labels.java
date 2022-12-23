package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*标签实体类*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("zj_labels")
public class labels {
    /*标签ID*/
    private int labelId;
    /*标签名称*/
    private String labelName;
    /*标签别名*/
    private String labelAlias;
    /*标签描述*/
    private String labelDescription;
    /*UserID*/
    private int userId;
}
