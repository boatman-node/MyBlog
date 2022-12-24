package com.Config;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MD5Utils {
    public String md5(String src){
        return DigestUtils.md5Hex(src);
    }
    //第一次加密
    public  String inputPassToFormPass(String inputPass,String salt){
        //md5加密密码前，先对密码进行处理，按以下salt的规则处理密码
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    //第二次加密
    public  String formPassToDBPass(String formPass, String salt){
        String str = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    //实际调用的方法，将第一次加密和第二次加密合并，结果应该一致
    public  String inputPassToDBPass(String inputPass, String salt){
        String formPass = inputPassToFormPass(inputPass,salt);
        String dbPass = formPassToDBPass(formPass, salt);
        return dbPass;
    }

    public  String GetUUid(){
        return UUID.randomUUID().toString();
    }


}