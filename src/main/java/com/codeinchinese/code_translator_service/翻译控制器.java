package com.codeinchinese.code_translator_service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeinchinese.java_code_translator.翻译Java代码;

@RestController
public class 翻译控制器 {

  private static final Logger 笔录 = LoggerFactory.getLogger(翻译控制器.class);


  @RequestMapping(value = "/", method = RequestMethod.POST)
  @ResponseBody
  public String 翻译(@RequestParam(name = "code", required = false, defaultValue = "") String 英文源码) {
    笔录.info("输入: " + 英文源码);
    return 翻译Java代码.汉化源码结构(英文源码);
  }
}
