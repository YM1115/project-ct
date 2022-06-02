package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName:student
 * date：2022/5/25 21:16
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class student {
    private int stuNum;
    private String stuName;
    private int stuClass;
}
