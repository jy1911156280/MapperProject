package com.aaa.one.controller;

import com.aaa.one.IQYService;
import com.aaa.one.model.MappingUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName MappingUnitController
 * @Description
 * @Author Jiayi
 * @Date 2020/6/4 17:51
 * @Version 1.0
 **/
@RestController
public class MappingUnitController {
    @Autowired
    IQYService iqyService;

    @GetMapping("/queryListAllUnit")
    public List<MappingUnit> queryListAll(){
        return iqyService.queryListAllUnit();
    }
}
