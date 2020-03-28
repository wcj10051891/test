package com.wcj.test.bean.req;

import lombok.Data;

/**
 * @author: wcj
 * @description: 用户参数带分页
 * @date: 2019/12/31 15:31
 **/
@Data
public class MktExamUserPageReq extends MktExamUserReq {
    /**
     * 分页页码，1
     */
    private Integer pageNum = 1;
    /**
     * 分页大小，10
     */
    private Integer pageSize = 10;
}
