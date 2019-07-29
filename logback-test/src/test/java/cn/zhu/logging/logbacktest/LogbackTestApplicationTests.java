package cn.zhu.logging.logbacktest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackTestApplicationTests {

    /**
     * 测试logback
     */
   @Test
   public void testLogback(){
        log.error("print error msg");
        log.warn("print warn msg");
        log.info("print info msg");
        log.debug("print debug msg");

   }

}
