package com.codeinchinese.code_translator_service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeinchinese.code_translator_service.模型.翻译;
import com.codeinchinese.java.源码翻译.翻译Java代码;

@RestController
public class 翻译控制器 {

  private static final Logger 笔录 = LoggerFactory.getLogger(翻译控制器.class);

  @CrossOrigin(origins = "http://translate.codeinchinese.com")
  @RequestMapping(value = "/", method = RequestMethod.POST)
  @ResponseBody
  public 翻译 翻译(@RequestParam(name = "code", required = false, defaultValue = "") String 英文源码) {
    笔录.info("输入: " + 英文源码);
    return new 翻译(翻译Java代码.翻译源码结构(英文源码));
  }
}
