package com.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("zj_user_friends")
/*好友状态信息*/
public class userFriends {
    /*标识ID*/
    private int id;
    /*用户ID*/
    private int userId;
    /*好友ID*/
    private int userFriendsId;
    /*好友备注*/
    private int userNote;
    /*好友状态*/
    private String userStatus;
}
