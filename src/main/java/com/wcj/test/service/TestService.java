package com.wcj.test.service;

import com.wcj.test.bean.req.MerchantExamBaseReq;
import com.wcj.test.bean.req.MktExamUserPageReq;
import com.wcj.test.bean.res.ExamErrorQuestionBean;
import com.wcj.test.bean.res.MerchantExamBaseRes;
import com.wcj.test.bean.res.PageInfoBean;
import com.wcj.test.remote.ExamClient;
import com.wcj.test.remote.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: wcj
 * @description: TestService
 * @date: 2020/1/17 10:20
 **/
@Service
public class TestService {
    @Autowired
    private TestClient testClient;
    @Autowired
    private ExamClient examClient;

    public String home() {
        return this.testClient.home();
    }

    public MerchantExamBaseRes<PageInfoBean<ExamErrorQuestionBean>> userErrorQuestionList( MerchantExamBaseReq<MktExamUserPageReq> req) {
        return this.examClient.userErrorQuestionList(req);
    }
}
