package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.UserInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserInformationImpl {
     ResultMassage RegisteredUsers(UserInformation userInformation);
     ResultMassage ChangeUsersMassage(UserInformation userInformation);
     ResultMassage<UserInformation> SelectUserName(int UserId);

     ResultMassage<String> DeleteUser(int UserId);
     ResultMassage<List<UserInformation>> UserList(int page,int pageSiz);
}
