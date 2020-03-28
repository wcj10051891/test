package com.wcj.test.bean.req;

import lombok.Data;

/**
 * @author: wcj
 * @description: B端考试系统请求
 * @date: 2019/12/27 14:09
 **/
@Data
public class MerchantExamBaseReq<T> {
    private String seqNo;
    private String sourceSystem = "NURTI_COLLEGE";
    private String version = "7.1.0";
    private T request;
}
