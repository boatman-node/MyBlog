package com.Servcie;

import com.Config.MD5Utils;
import com.Entity.ResultMassage;
import com.Entity.UserInformation;
import com.Impl.UserInformationImpl;
import com.Mapper.UserInformationMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInformationService implements UserInformationImpl {
    @Autowired
    UserInformationMapper informationMapper;
    @Autowired
    MD5Utils md5Utils;
    /*注册用户*/
    @Override
    public ResultMassage RegisteredUsers(UserInformation userInformation) {
        ResultMassage resultMassage = new ResultMassage(400, "注册用户失败!");
        if(SelectUserName(userInformation.getUserId()).getMassageCode()==200){
            return resultMassage;
        }
        String s = md5Utils.GetUUid().substring(0,8);
        userInformation.setUserPassWrod(md5Utils.formPassToDBPass(userInformation.getUserPassWrod(),s));
        userInformation.setInfillSalt(s);
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
    /*查找用户*/
    @Override
    public ResultMassage<UserInformation> SelectUserName(int UserId) {
        UserInformation userInformation = informationMapper.selectOne(new QueryWrapper<UserInformation>().eq("user_id", UserId));
        return userInformation!=null?new ResultMassage<UserInformation>(200,userInformation):new ResultMassage<UserInformation>(400,userInformation);
    }
    /*删除用户*/
    @Override
    public ResultMassage<String> DeleteUser(int UserId) {
        return informationMapper.delete(new QueryWrapper<UserInformation>().eq("user_id", UserId))>0?new ResultMassage<String>(200,"删除成功!"):new ResultMassage<String>(400,"删除失败");
    }

    @Override
    public ResultMassage UserList(int page,int pageSize) {
        //分页参数
        Page<UserInformation> rowPage = new Page(page, pageSize);
        //queryWrapper组装查询where条件
        LambdaQueryWrapper<UserInformation> queryWrapper = new LambdaQueryWrapper<>();
        return new ResultMassage<>(200,informationMapper.selectPage(rowPage,queryWrapper).getRecords());
    }

    @Override
    public void aveUserInformation(UserInformation userInformation) {


    }



}
