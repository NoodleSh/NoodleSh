package com.hi_4.test.bakejun;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Speed_AplusB {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            int num = Integer.parseInt(br.readLine()); //입력한 문자를 숫자로 바꿈 ,공백을 포함해서 읽음

            StringTokenizer str; //문자열을 토큰화 시키기 위해 선언

            System.out.println("반복할 횟수: " + num);

            for(int i = 0; i <num; i++) {
                str = new StringTokenizer(br.readLine()," "); //num을 입력받음
                bw.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
                //문자열
            }

            br.close();
            bw.flush();
            bw.close();


    }
}
