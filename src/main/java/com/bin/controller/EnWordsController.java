package com.bin.controller;


import com.bin.pojo.EnWords;
import com.bin.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
public class EnWordsController {

    @Autowired
    private WordsService wordsService;


    @GetMapping
    public EnWords findByWords(@RequestParam("word") String word){
        EnWords byWords = wordsService.findByWords(word);
        if (byWords!=null){
            return byWords;
        }else {
            return null;
        }

    }

    @GetMapping("/random")
    public List<EnWords> getRandomWords(){
        List<EnWords> list = wordsService.getRandomWords();
        if (list!=null &&list.size()>0){

            return list;
        }else {
            return null;
        }

    }

}
