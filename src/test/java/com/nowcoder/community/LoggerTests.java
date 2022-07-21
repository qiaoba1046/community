package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Le
 * @Data 2022/7/20 20:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {
    //LoggerTests.class,类名即logger的名字，这样不同的logger在不同的类下有区别
    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger() {
        System.out.println(logger.getName());
        //开发中debug有效，上线后debug取消
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
