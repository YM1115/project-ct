package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName:Students
 * date：2022/5/13 10:04
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Students {
    private int sid;
    private int stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
}
