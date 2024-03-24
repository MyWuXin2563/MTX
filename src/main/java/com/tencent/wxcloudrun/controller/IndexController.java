package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index控制器
 */
@Controller
@RequestMapping("/")
public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */

  @GetMapping
  public String index() {
    return "index";
  }

}
