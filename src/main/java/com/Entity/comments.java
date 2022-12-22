package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("zj_comments")
public class comments {
    /*评论ID */
    private int commentId;
    /*发表用户ID */
    private int userId;
    /*评论博文ID*/
    private int articleId;
    /*点赞数*/
    private int commentLikeCount ;
    /*评论日期*/
    private Date commentDate;
    /*评论内容 */
    private String commentContent;
    /*父评论ID */
    private int parentCommentId;
}
