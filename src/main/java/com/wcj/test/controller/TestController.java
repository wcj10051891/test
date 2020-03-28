package com.wcj.test.controller;

import com.wcj.test.bean.req.MerchantExamBaseReq;
import com.wcj.test.bean.req.MktExamUserPageReq;
import com.wcj.test.bean.req.PageReq;
import com.wcj.test.bean.res.ExamErrorQuestionBean;
import com.wcj.test.bean.res.MerchantExamBaseRes;
import com.wcj.test.bean.res.PageInfoBean;
//import com.wcj.test.service.DataService;
import com.wcj.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: wcj
 * @description: TestController
 * @date: 2020/1/15 11:23
 **/
@RestController
public class TestController {

    @Value("${version}")
    private String version;

    @Autowired
    private TestService testService;

//    @Autowired
//    private DataService dataService;

    @GetMapping("/test/now")
    public String now() {
        return "version:" + version + " at " + new Date().toString();
    }

    @GetMapping("/test/home")
    public String home() {
        return this.testService.home();
    }


    @GetMapping("/test/userErrorQuestionList")
    public MerchantExamBaseRes<PageInfoBean<ExamErrorQuestionBean>> userErrorQuestionList() {
        MerchantExamBaseReq<MktExamUserPageReq> baseReq = new MerchantExamBaseReq<>();
        baseReq.setSeqNo("SEQ" + System.currentTimeMillis());
        MktExamUserPageReq listReq = new MktExamUserPageReq();
        listReq.setAccountId(22270503L);
        listReq.setCustomerId(32758118L);
        listReq.setPageNum(1);
        listReq.setPageSize(10);
        baseReq.setRequest(listReq);
        return this.testService.userErrorQuestionList(baseReq);
    }

//    @GetMapping("/test/count")
//    public Integer count() {
//        return this.dataService.count();
//    }
}
