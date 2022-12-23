package com.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("zj_users")
/*用户实体类*/
public class UserInformation {


    /*用户ID*/
    @TableField("user_id")
    private int userId;
    @TableField("user_ip")
    /*用户Ip*/
    private String userIp;
    @TableField("user_name")
    /*用户名*/
    private String userName;
    @TableField("user_password")
    /*用户用户密码*/
    private String userPassWrod;
    @TableField("user_email")
    /*用户邮箱*/
    private String userEmail;
    @TableField("user_profile_photo")
    /*用户头像*/
    private String userProfilePhoto;
    @TableField("user_registration_time")
    /*用户注册时间*/
    private Date userRegistrationtTime;
    @TableField("user_birthday")
    /*用户生日*/
    private Date userBirthday;
    @TableField("user_age")
    /*用户年龄*/
    private int userAge;
    @TableField("user_telephone_number")
    /*用户手机号*/
    private String userTelephoneNumber;
    @TableField("user_nickname")
    /*用户昵称*/
    private String userNickname;

    public UserInformation(String userIp, String userName, String userPassWrod, String userEmail, String userProfilePhoto, Date userRegistrationtTime, Date userBirthday, int userAge, String userTelephoneNumber, String userNickname) {
        this.userIp = userIp;
        this.userName = userName;
        this.userPassWrod = userPassWrod;
        this.userEmail = userEmail;
        this.userProfilePhoto = userProfilePhoto;
        this.userRegistrationtTime = userRegistrationtTime;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userTelephoneNumber = userTelephoneNumber;
        this.userNickname = userNickname;
    }
}
