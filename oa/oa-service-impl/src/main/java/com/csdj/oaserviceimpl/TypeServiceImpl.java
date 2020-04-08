package com.csdj.oaserviceimpl;

import com.csdj.oadao.TypeMapper;
import com.csdj.pojo.housetype;
import com.csdj.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper mapper;

    @Override
    public List<housetype> getTypes() {
        return mapper.selectAll();
    }
}
