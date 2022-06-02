package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.security.PrivateKey;
import java.util.List;

/**
 * ClassName:Clazz
 * date：2022/5/25 21:17
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Clazz {
    private int cId;
    private String cName;
    private List<student> students;
}
