package com.wcj.test.bean.res;

import lombok.Data;

/**
 * @author: wcj
 * @description: B端考试系统响应
 * @date: 2019/12/27 14:21
 **/
@Data
public class MerchantExamBaseRes<T> {
    /**
     * 返回编码
     */
    private String code;
    /**
     * 返回信息
     */
    private String desc;
    /**
     * 请求序列号
     */
    private String seqNo;
    /**
     * 响应数据
     */
    private T response;
}
