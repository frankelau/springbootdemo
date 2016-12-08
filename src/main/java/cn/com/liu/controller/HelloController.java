package cn.com.liu.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxianzhao on 2016/12/8.
 */
@RestController
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("hello")
    public String index(){
        logger.info("开始进入HelloWorld控制器...");
        return "Hello World";
    }

}
