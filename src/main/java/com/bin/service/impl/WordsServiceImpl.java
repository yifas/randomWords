package com.bin.service.impl;

import com.bin.dao.WordsDao;
import com.bin.pojo.EnWords;
import com.bin.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class WordsServiceImpl implements WordsService {

    @Autowired
    private WordsDao wordsDao;

    @Override
    public EnWords findByWords(String words) {

        return wordsDao.findByWords(words);
    }

    @Override
    public List<EnWords> getRandomWords() {
        Integer[] integers = new Integer[16];
        Random random = new Random();
        int MAX=103981;
        int MIN=1;
        for (int i = 0; i < 10; i++) {
            integers[i]=random.nextInt(MAX-MIN+1)+MIN;
        }
        List<EnWords> randomWords = wordsDao.getRandomWords(integers);
        return randomWords;
    }
}
