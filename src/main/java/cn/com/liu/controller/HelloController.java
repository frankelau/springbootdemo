package cn.com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxianzhao on 2016/12/8.
 */
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String index(){
        return "Hello World";
    }

}
