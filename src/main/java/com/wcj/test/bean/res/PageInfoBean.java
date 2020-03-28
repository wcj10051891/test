package com.wcj.test.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: wcj
 * @description: 分页数据
 * @date: 2019/12/27 14:27
 **/
@ApiModel(value = "分页数据")
@Data
public class PageInfoBean<T> {
    @ApiModelProperty(value = "数据列表")
    private List<T> list;
    @ApiModelProperty(value = "总记录数")
    private Integer total;
    @ApiModelProperty(value = "总页数")
    private Integer pages;
}
