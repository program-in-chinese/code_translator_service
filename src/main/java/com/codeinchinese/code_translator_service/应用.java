package com.codeinchinese.code_translator_service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class 应用 implements CommandLineRunner {

  private static final Logger 笔录 = LoggerFactory.getLogger(应用.class);

  public static void main(String[] 参数) {
    笔录.info("服务启动开始");
    SpringApplication.run(应用.class, 参数);
    笔录.info("服务已启动");
  }

  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
    
  }

}
