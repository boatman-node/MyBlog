package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/*文章详细信息表*/
@TableName("zj_articles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class articles {
    /*博文ID*/
    private int articleId ;
    /*发表用户ID*/
    private int userId ;
    /*博文标题*/
    private String articleTitle;
    /*博文内容 */
    private String articleContent;
    /*浏览量 */
    private int articleViews;
    /*评论总数*/
    private int articleCommentCount;
    /*发表时间 */
    private Date articleDate;
   /*点赞数量*/
    private int articleLikeCount;

}
