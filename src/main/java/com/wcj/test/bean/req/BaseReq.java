package com.wcj.test.bean.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author daniel.chen
 * @Date 2018/1/5 - 9:42
 * @Description
 */
@Data
public class BaseReq implements Serializable {
    private static final long serialVersionUID = 227900769159246324L;

    @ApiModelProperty(value = "默认后台生成,请求序列号")
    protected String seqNo;
    /**
     * 来源系统
     */
    @ApiModelProperty(value = "请求来源系统")
    protected String fromSystem;
    /**
     * 来源业务
     */
    @ApiModelProperty(value = "请求来源业务")
    protected String fromBiz;
}
