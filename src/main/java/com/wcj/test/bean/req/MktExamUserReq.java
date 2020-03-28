package com.wcj.test.bean.req;

import lombok.Data;

/**
 * @author: wcj
 * @description: 考试列表请求
 * @date: 2019/12/27 14:12
 **/
@Data
public class MktExamUserReq {
    /**
     * 集团人员id
     */
    private Long accountId;
    /**
     * 集团会员id
     */
    private Long customerId;
}
