package com.wcj.test.remote;

import com.wcj.test.bean.req.MerchantExamBaseReq;
import com.wcj.test.bean.req.MktExamUserPageReq;
import com.wcj.test.bean.res.ExamErrorQuestionBean;
import com.wcj.test.bean.res.MerchantExamBaseRes;
import com.wcj.test.bean.res.PageInfoBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wcj
 * @description: TestClient
 * @date: 2020/1/17 10:21
 **/
@FeignClient(name="test-service", url = "${target.url}")
public interface TestClient {
    @GetMapping
    String home();
}
