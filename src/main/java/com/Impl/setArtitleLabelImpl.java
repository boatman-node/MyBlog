package com.Impl;

import com.Entity.ResultMassage;
import com.Entity.setArtitleLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface setArtitleLabelImpl {
    ResultMassage<String> insetArtitleLabel(int ArtitleId,int LabelId);
}
