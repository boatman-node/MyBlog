package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.comments;
import com.Impl.commentsImpl;
import com.Mapper.commentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class commentsService implements commentsImpl {
    @Autowired
    commentsMapper commentsM;
    @Override
    public ResultMassage GetMsg(comments comments) {
        int insert = commentsM.insert(comments);
        return new ResultMassage(insert>0?400:200,insert>0?"插入成功":"插入失败");
    }
}
