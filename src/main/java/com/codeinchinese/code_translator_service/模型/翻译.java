package com.codeinchinese.code_translator_service.模型;

public class 翻译 {

  private final String 内容;

  public 翻译() {
    this.内容 = "";
  }

  public 翻译(String 内容) {
    this.内容 = 内容;
  }

  public String get内容() {
    return 内容;
  }
}
