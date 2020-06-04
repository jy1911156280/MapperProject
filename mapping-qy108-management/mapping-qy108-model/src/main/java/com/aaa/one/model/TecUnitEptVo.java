package com.aaa.one.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName TecUnitEptVo
 * @Description
 * @Author Jiayi
 * @Date 2020/6/3 8:54
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TecUnitEptVo implements Serializable {

    //资质等级
    private String level;
    //单位数量
    private Integer unitNum;
    //初级技术人员数量
    private Integer junTec;
    //中级技术人员数量
    private Integer midTec;
    //高级技术人员数量
    private Integer senTec;
    //测距仪数量
    private Integer rangeFin;
    //水准仪数量
    private Integer surLev;
    //接收机数量
    private Integer receiver;
    //全站仪数量
    private Integer totalSta;

}
