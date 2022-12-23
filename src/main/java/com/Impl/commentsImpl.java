package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.comments;

public interface commentsImpl {
    ResultMassage GetCommentsList(int UserId,int ArticleId);
    ResultMassage insertComments(comments comments);
}
