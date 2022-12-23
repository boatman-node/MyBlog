package com.Servcie;

import com.Entity.ResultMassage;
import com.Entity.setArtitleLabel;
import com.Impl.setArtitleLabelImpl;
import com.Mapper.setArtitleLabelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class setArtitleLabelService implements setArtitleLabelImpl {
    @Autowired
    setArtitleLabelMapper artitleLabelMapper;
    @Override
    public ResultMassage<String> insetArtitleLabel(int ArtitleId, int LabelId) {
        return artitleLabelMapper.insert(new setArtitleLabel(ArtitleId,LabelId))>0?new ResultMassage<String>(200,"添加标签成功!"):new ResultMassage<String>(400,"添加标签失败!");
    }
}
