package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.articles;

import java.util.List;

public interface articlesImpl {
    ResultMassage<String> InsertArticles(articles articles,String labelsName,int userid);
    ResultMassage<String>DeleteArticles(String articlesName,int userid);

    ResultMassage<articles>SelectArticles(String articlesName,int userid);
    ResultMassage<String> UpDataArticles(articles articles,int ArticlesId,int userid);

    ResultMassage<List<articles>>TopArticle();

    ResultMassage LatestArticle();
}
