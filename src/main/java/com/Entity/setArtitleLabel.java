package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("zj_set_artitle_label")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class setArtitleLabel {
    /*文章标签id*/
    private int articleId;
    /*标签Id*/
    private int labelId;

}
