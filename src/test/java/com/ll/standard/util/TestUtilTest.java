package com.ll.standard.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestUtilTest { //테스트 유틸도 TDD방식으로.
    @Test
    @DisplayName("IOUtil.genScanner()")
    public void t1() {
        Scanner scanner = TestUtil.getScanner("""
                등록
                나의 죽음을 적에게 알리지 말라!
                이순신
                """.stripIndent().trim());
        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("나의 죽음을 적에게 알리지 말라!");
        assertThat(author).isEqualTo("이순신");

    }

        @Test
        @DisplayName("TestUtil.setOutToByteArray()")
        public void t2(){
            ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

            System.out.println("2 / 이순신 / 나의 죽음을 적에게 알리지 말라!");

            String out = byteArrayOutputStream.toString().trim();
            TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

            assertThat(out).isEqualTo("2 / 이순신 / 나의 죽음을 적에게 알리지 말라!");
            System.out.println("이제는 화면에 출력 됩니다.");

    }
}
