package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.UserInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserInformationImpl {
     ResultMassage RegisteredUsers(UserInformation userInformation);
     ResultMassage ChangeUsersMassage(UserInformation userInformation);
     ResultMassage<UserInformation> SelectUserName(int UserId);

     ResultMassage<String> DeleteUser(int UserId);
}
