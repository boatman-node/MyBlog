package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("zj_sorts")
@Data
@AllArgsConstructor
@NoArgsConstructor
/*分类信息*/
public class sorts {
    /*分类ID*/
    private int sortId;
    /*分类名称*/
    private String sortName;
    /*分类别名*/
    private String sortAlias;
    /*分类描述*/
    private String sortDescription;
    /*父分类ID*/
    private int parentSortId;
}
