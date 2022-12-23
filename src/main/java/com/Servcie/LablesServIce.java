package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.labels;
import com.Impl.lablesImpl;
import com.Mapper.lablesMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LablesServIce implements lablesImpl {
    @Autowired
    lablesMapper lablesMapper;
    @Override
    public ResultMassage<String> insertLabImpl(labels labels) {
        return lablesMapper.insert(labels)>0?new ResultMassage<String>(200,"添加标签成功!"):new ResultMassage<String>(400,"添加标签失败！");
    }

    @Override
    public ResultMassage<labels> SelectLabImpl(int userId,String labels) {
        labels label_name = lablesMapper.selectOne(new QueryWrapper<labels>().eq("label_name", labels).and(e->e.eq("user_id",userId)));
        return label_name!=null?new ResultMassage<labels>(200,label_name):new ResultMassage<labels>(400,label_name);
    }

    @Override
    public ResultMassage<labels> DeleteLabImpl(int userId,String labels) {
        return null;
    }
}
