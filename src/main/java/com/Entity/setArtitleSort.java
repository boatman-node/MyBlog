package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("zj_set_artitle_sort")
@Data
@AllArgsConstructor
@NoArgsConstructor
/*文章分类*/
public class setArtitleSort {
    /*文章ID*/
    private int articleId;
    /*分类ID*/
    private int sortId;
}
