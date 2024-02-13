package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator; // 오버라이딩 강제화

public class AscendingPrice implements Comparator<BookDTO>{

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        if(o1.getPrice() > o2.getPrice()){
            result = 1;
        }else if(o1.getPrice() <o2.getPrice()){
            result = -1;
        }else{
            result = 0;
        }

        return result;
    }
}
