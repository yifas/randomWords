package com.bin.service;

import com.bin.pojo.EnWords;

import java.util.List;

public interface WordsService {
    /**
     * 根据单词查找翻译
     * @param words 单词
     * @return 对象
     */
    EnWords findByWords(String words);

    /**
     * 返回随机单词
     * @return
     */
    List<EnWords> getRandomWords();
}
