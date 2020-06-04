package com.aaa.one.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/12 23:06
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseModel implements Serializable {

    @Id
    @NotNull
    private Long id;

    @Column(name = "create_time")
    @Max(value = 100,message = "时间长度不能超过100")
    private String createTime;

    @Column(name = "modify_time")
    @Max(value = 100,message = "时间长度不能超过100")
    private String modifyTime;
}
