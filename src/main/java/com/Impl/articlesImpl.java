package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.articles;

public interface articlesImpl {
    ResultMassage<String> InsertArticles(articles articles,String labelsName,int userid);
    ResultMassage<String>DeleteArticles(String articlesName,int userid);

    ResultMassage<articles>SelectArticles(String articlesName,int userid);


}
