package com.qfedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * ClassName:Book
 * date：2022/5/18 15:13
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private Date book_data;
    private String book_imag;
    private String book_desc;
    private int book_delete;

}
