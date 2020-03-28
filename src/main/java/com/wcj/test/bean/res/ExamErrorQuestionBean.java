package com.wcj.test.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: wcj
 * @description: 错题
 * @date: 2019/12/26 9:49
 **/
@ApiModel(value = "错题")
@Data
public class ExamErrorQuestionBean {
    @ApiModelProperty(value = "用户的答案，使用optionId，多选用’@IS@’分隔，且optionId升序排列")
    private String answer;
    @ApiModelProperty(value = "考试id")
    private String examId;
    @ApiModelProperty(value = "考试名称")
    private String examName;
    @ApiModelProperty(value = "题目Id")
    private Long questionId;
    @ApiModelProperty(value = "题目标题")
    private String questionTitle;
    @ApiModelProperty(value = "题目类型(1-单选 2-复选 3-单行文本 4-多行文本)")
    private Integer questionType;
    @ApiModelProperty(value = "选项列表")
    private List<ExamQuestionOptionBean> options;
}
