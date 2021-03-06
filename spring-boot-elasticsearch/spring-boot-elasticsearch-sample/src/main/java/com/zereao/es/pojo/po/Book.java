package com.zereao.es.pojo.po;

import lombok.Data;

/**
 * @author Zereao
 * @version 2019/05/14 15:15
 */
@Data
public class Book {
    private String id;
    /**
     * 文章类型
     */
    private String type;
    /**
     * 文章字数
     */
    private Integer wordCount;
    /**
     * 作者
     */
    private String author;
    /**
     * 标题
     */
    private String title;
    /**
     * 出版日期
     */
    private String publishDate;
}
