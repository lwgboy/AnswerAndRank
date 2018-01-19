package com.xyl.game.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 题目实体类
 * @author Naah
 */

@Getter
@Setter

public class AnnualMeetingGameQuestion {
    private Integer id;
    private String topic;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private Byte rightAnswer;
    private Date createTime;
}







