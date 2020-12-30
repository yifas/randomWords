package com.bin.dao;

import com.bin.pojo.EnWords;

import java.util.List;


public interface WordsDao {
    /**
     * 根据单词查找翻译
     * @param words 单词
     * @return 对象
     */
    EnWords findByWords(String words);

    /**
     * 返回随机单词
     * @param integers
     * @return
     */
    List<EnWords> getRandomWords(Integer[] integers);
}
