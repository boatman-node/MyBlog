package com.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*用户实体类*/
public class UserInformation {
    /*用户ID*/
    private int userId;
    /*用户Ip*/
    private String userIp;
    /*用户名*/
    private String userName;
    /*用户用户密码*/
    private String userPassWrod;
    /*用户邮箱*/
    private String userEmail;
    /*用户头像*/
    private String userProfilePhoto;
    /*用户注册时间*/
    private Date userRegistrationtTime;
    /*用户生日*/
    private Date userBirthday;
    /*用户年龄*/
    private int userAge;
    /*用户手机号*/
    private int userTelephoneNumber;
    /*用户昵称*/
    private String userNickname;


}
