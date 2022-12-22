package com;


import com.Entity.comments;
import com.Servcie.commentsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MyBlogApplicationTests {
    @Autowired
    commentsService commentsService;
    @Test
    void test01(){
        System.out.println(commentsService.GetMsg(new comments(2, 2, 3, 4, new Date(), "我觉得你像傻逼一样", 8)));
    }

}
