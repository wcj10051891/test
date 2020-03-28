package com.wcj.test.bean.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: daniel.chen
 * @description: 分页入参
 * @since: 2019-11-25 17:10
 **/
@Data
public class PageReq extends BaseReq {

    @ApiModelProperty(value = "页码,默认1")
    private Integer pageIndex = 1;
    @ApiModelProperty(value = "每页大小，默认10")
    private Integer pageSize = 10;
}
