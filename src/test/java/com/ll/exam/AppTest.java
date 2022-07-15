package com.ll.exam;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 스캐너에_키보드가_아닌_문자열을_입력으로_설정() {
        Scanner sc = TestUtil.genScanner("안녕");

        String cmd = sc.nextLine().trim();
        assertEquals("안녕", cmd);
    }

    @Test
    public void 문자열을_파일에_저장() {
        Util.file.mkdir("test_data");
        Util.file.saveToFile("test_data/1.txt", "안녕");

        String body = Util.file.readFromFile("test_data/1.txt");
        assertEquals("안녕", body);
    }
}
