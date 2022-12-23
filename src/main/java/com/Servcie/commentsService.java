package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.comments;
import com.Impl.commentsImpl;
import com.Mapper.commentsMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commentsService implements commentsImpl {
    @Autowired
    commentsMapper commentsM;
    /**/

    @Override
    public ResultMassage GetCommentsList(int UserId, int ArticleId) {
        List<comments> comments = commentsM.selectList(new QueryWrapper<comments>().eq("user_id", UserId).and(e -> e.eq("article_id", ArticleId)));
        return new ResultMassage(200,comments);
    }

    @Override
    public ResultMassage insertComments(comments comments) {
        return commentsM.insert(comments)>0?new ResultMassage(200,"评论成功!"):new ResultMassage(400,"评论失败!");
    }
}
