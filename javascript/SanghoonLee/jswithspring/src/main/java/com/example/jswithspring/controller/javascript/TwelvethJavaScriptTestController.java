package com.example.jswithspring.controller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TwelvethJavaScriptTestController {

    @GetMapping("checkListWithArrayTest")
    public String getCheckListWithArrayTest () {
        log.info("getCheckListWithArrayTest()");

        return "/javascript/twelveth/checkListWithArrayTest";
    }
}