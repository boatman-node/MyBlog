package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.articles;
import com.Entity.labels;
import com.Impl.articlesImpl;
import com.Mapper.articlesMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class articlesService implements articlesImpl {
    @Autowired
    articlesMapper articlesMapper;
    @Autowired
    LablesServIce lablesServIce;
    @Autowired
    setArtitleLabelService labelService;
    @Override
    public ResultMassage<String>InsertArticles(articles articles,String labelsName,int userid) {
        ResultMassage<labels> labelsResultMassage = lablesServIce.SelectLabImpl(userid,labelsName);
        int insert = articlesMapper.insert(articles);
        if (labelsResultMassage.getMassageCode()==200&insert>0) {
            labelService.insetArtitleLabel(articles.getArticleId(),labelsResultMassage.getResultContent().getLabelId());
         }
        return insert>0?new ResultMassage<String>(200,"发布成功！"):new ResultMassage<String>(400,"发布失败,请检出服务器!");
    }

    @Override
    public ResultMassage<String> DeleteArticles(String articlesName,int userid) {
        if (SelectArticles(articlesName,userid).getMassageCode()==200) {
            return articlesMapper.delete(new QueryWrapper<articles>().eq("article_title", articlesName).and(e -> e.eq("user_id", userid)))>0?
                    new ResultMassage<String>(200,"删除成功"):new ResultMassage<String>(400,"删除失败!");
        }
        return new ResultMassage<String>(400,"暂时没有找到要删除的内容!");
    }

    @Override
    public ResultMassage<articles> SelectArticles(String articlesName,int userid) {
        articles articles = articlesMapper.selectOne(new QueryWrapper<articles>().eq("article_title", articlesName).and(e -> e.eq("user_id", userid)));
        return articles!=null? new ResultMassage<articles>(200,articles):new ResultMassage<articles>(400,articles);
    }
}
