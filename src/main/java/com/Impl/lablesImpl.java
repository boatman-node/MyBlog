package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.labels;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface lablesImpl{
    ResultMassage<String> insertLabImpl(labels labels);
    ResultMassage<labels> SelectLabImpl(int userId,String labels);
    ResultMassage<labels> DeleteLabImpl(int userId,String labels);
}
