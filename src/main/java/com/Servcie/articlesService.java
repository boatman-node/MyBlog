package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.articles;
import com.Entity.labels;
import com.Impl.articlesImpl;
import com.Mapper.articlesMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class articlesService implements articlesImpl {
    @Autowired
    articlesMapper articlesMapper;
    @Autowired
    LablesServIce lablesServIce;
    @Autowired
    setArtitleLabelService labelService;
    /*插入文章*/
    @Override
    public ResultMassage<String>InsertArticles(articles articles,String labelsName,int userid) {
        ResultMassage<labels> labelsResultMassage = lablesServIce.SelectLabImpl(userid,labelsName);
        int insert = articlesMapper.insert(articles);
        if (labelsResultMassage.getMassageCode()==200&insert>0) {
            labelService.insetArtitleLabel(articles.getArticleId(),labelsResultMassage.getResultContent().getLabelId());
         }
        return insert>0?new ResultMassage<String>(200,"发布成功！"):new ResultMassage<String>(400,"发布失败,请检出服务器!");
    }
   /*删除文章*/
    @Override
    public ResultMassage<String> DeleteArticles(String articlesName,int userid) {
        if (SelectArticles(articlesName,userid).getMassageCode()==200) {
            return articlesMapper.delete(new QueryWrapper<articles>().eq("article_title", articlesName).and(e -> e.eq("user_id", userid)))>0?
                    new ResultMassage<String>(200,"删除成功"):new ResultMassage<String>(400,"删除失败!");
        }
        return new ResultMassage<String>(400,"暂时没有找到要删除的内容!");
    }
    /*查看文章*/
    @Override
    public ResultMassage<articles> SelectArticles(String articlesName,int userid) {
        articles articles = articlesMapper.selectOne(new QueryWrapper<articles>().eq("article_title", articlesName).and(e -> e.eq("user_id", userid)));
        return articles!=null? new ResultMassage<articles>(200,articles):new ResultMassage<articles>(400,articles);
    }
    /*更新文章*/
    @Override
    public ResultMassage<String> UpDataArticles(articles articles, int  ArticlesName, int userid) {
        return articlesMapper.update(articles,new QueryWrapper<articles>().eq("article_id",ArticlesName).and(e->e.eq("user_id",userid)))>0?
                new ResultMassage<String>(200,"更新成功!"):new ResultMassage<String>(400,"更新失败!");
    }
    /*热门文章*/
    @Override
    public ResultMassage<List<articles>> TopArticle() {
        return new ResultMassage<List<articles>>(200,articlesMapper.selectList(new LambdaQueryWrapper<articles>().orderByDesc(articles::getArticleLikeCount).last("limit 8")));
    }
    /*最新文章*/
    @Override
    public ResultMassage<List<articles>> LatestArticle() {
       return new ResultMassage<List<articles>>(200,articlesMapper.selectList(new LambdaQueryWrapper<articles>().orderByDesc(articles::getArticleDate).last("limit 8")));
    }
}
