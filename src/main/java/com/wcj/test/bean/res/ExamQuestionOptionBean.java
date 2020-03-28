package com.wcj.test.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: wcj
 * @description: 题目选项
 * @date: 2019/12/19 15:43
 **/
@ApiModel(value = "题目选项")
@Data
public class ExamQuestionOptionBean {
    @ApiModelProperty(value = "是否是正确选项")
    private Integer isCorrect;
    @ApiModelProperty(value = "选项名称")
    private String name;
    @ApiModelProperty(value = "选项ID")
    private Long optionId;
    @ApiModelProperty(value = "题目ID")
    private Long questionId;
}
