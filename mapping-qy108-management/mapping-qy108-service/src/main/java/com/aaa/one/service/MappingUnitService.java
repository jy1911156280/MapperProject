package com.aaa.one.service;

import com.aaa.one.base.BaseService;
import com.aaa.one.mapper.MappingUnitMapper;
import com.aaa.one.mapper.TecUnitEptVoMapper;
import com.aaa.one.model.MappingUnit;
import com.aaa.one.model.TecUnitEptVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MappingUnitService
 * @Description
 * @Author Jiayi
 * @Date 2020/6/2 17:12
 * @Version 1.0
 **/
@Service
public class MappingUnitService extends BaseService {
    @Autowired
    MappingUnitMapper mappingUnitMapper;

    @Autowired
    TecUnitEptVoMapper tecUnitEptVoMapper;


    /**
        *@Author Jiayi
        *@Description   查询所有的单位信息
        *@Param []
        *@Date 2020/6/2 17:14
        *@return java.util.List<com.aaa.one.model.MappingUnit>
    **/
    public List<MappingUnit> queryListAll(){
        return mappingUnitMapper.selectAll();
    }

    /**
        *@Author Jiayi
        *@Description   查询所有的单位信息  开启分页
        *@Param [currentPage, pageSize]
        *@Date 2020/6/2 18:57
        *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingUnit>
    **/
    public PageInfo<MappingUnit> queryListAllByPage(Integer currentPage, Integer pageSize){
        PageInfo pageInfo = null;
        try {
            pageInfo = super.queryListByPage(currentPage, pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pageInfo;
    }


    /**
        *@Author Jiayi
        *@Description   人员设备汇总统计查询
        *@Param []
        *@Date 2020/6/3 10:15
        *@return java.util.List<com.aaa.one.model.TecUnitEptVo>
    **/
    public List<TecUnitEptVo> getAllInfo(){
        List<TecUnitEptVo> all = tecUnitEptVoMapper.getAll();
        if (null != all && all.size()>0){
            return all;
        }
        return null;
    }

    /**
        *@Author Jiayi
        *@Description    单位资质统计
        *@Param []
        *@Date 2020/6/3 10:46
        *@return java.util.Map<java.lang.String,java.lang.Object>
    **/
    public Map<String,Object> getUnitLevel(){
        Map<String, Object> unitLevel = mappingUnitMapper.getUnitLevel();
        if (unitLevel.isEmpty()){
            return null;
        }
        return unitLevel;
    }


}
