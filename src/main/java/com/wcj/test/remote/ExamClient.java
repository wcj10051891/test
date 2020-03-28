package com.wcj.test.remote;

import com.wcj.test.bean.req.MerchantExamBaseReq;
import com.wcj.test.bean.req.MktExamUserPageReq;
import com.wcj.test.bean.res.ExamErrorQuestionBean;
import com.wcj.test.bean.res.MerchantExamBaseRes;
import com.wcj.test.bean.res.PageInfoBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: wcj
 * @description: TestClient
 * @date: 2020/1/17 10:21
 **/
@FeignClient(name="exam-service", url = "${exam.url}")
public interface ExamClient {
    /**
     * 错题列表
     * @param req
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/api/internal/exam/userErrorQuestionList")
    MerchantExamBaseRes<PageInfoBean<ExamErrorQuestionBean>> userErrorQuestionList(@RequestBody MerchantExamBaseReq<MktExamUserPageReq> req);
}
