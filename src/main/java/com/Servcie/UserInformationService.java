package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.UserInformation;
import com.Impl.UserInformationImpl;
import com.Mapper.UserInformationMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationService implements UserInformationImpl {
    @Autowired
    UserInformationMapper informationMapper;
    /*注册用户*/
    @Override
    public ResultMassage RegisteredUsers(UserInformation userInformation) {
        ResultMassage resultMassage = new ResultMassage(400, "注册用户失败!");
        if(SelectUserName(userInformation.getUserId()).getMassageCode()==200){
            return resultMassage;
        }
        return informationMapper.insert(userInformation)>0?new ResultMassage(200,"注册用户成功！"):resultMassage;
    }
    /*更新数据*/
    @Override
    public ResultMassage ChangeUsersMassage(UserInformation userInformation) {
        ResultMassage resultMassage = new ResultMassage(400,"更新失败请请稍后再试!");
        if(SelectUserName(userInformation.getUserId()).getMassageCode()==200){
            return resultMassage;
        }
        return informationMapper.update(userInformation,new QueryWrapper<UserInformation>().eq("user_id",userInformation))>0?new ResultMassage(200,"更改信息成功!"):resultMassage;
    }

    @Override
    public ResultMassage<UserInformation> SelectUserName(int UserId) {
        UserInformation userInformation = informationMapper.selectOne(new QueryWrapper<UserInformation>().eq("user_id", UserId));
        return userInformation!=null?new ResultMassage<UserInformation>(200,userInformation):new ResultMassage<UserInformation>(400,userInformation);
    }

    @Override
    public ResultMassage<String> DeleteUser(int UserId) {
        return informationMapper.delete(new QueryWrapper<UserInformation>().eq("user_id", UserId))>0?new ResultMassage<String>(200,"删除成功!"):new ResultMassage<String>(400,"删除失败");
    }


}
