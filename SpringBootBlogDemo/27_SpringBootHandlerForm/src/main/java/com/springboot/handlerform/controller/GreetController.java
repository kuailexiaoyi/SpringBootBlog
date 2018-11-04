package com.springboot.handlerform.controller;

import com.springboot.handlerform.entity.Greet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-21 22:49
 * @Version:v1.0
 */
@Controller
@RequestMapping("/")
public class GreetController {

    /**
     * @descirption: 跳转到表单页面
     * @param model
     * @return
     */
    @RequestMapping(value = "greeting",method = RequestMethod.GET)
    public String showGreeting(Model model) {
        model.addAttribute("greet", new Greet());
        return "greet";
    }


    /**
     * @descirption：跳转到结果页面
     * @param greet
     * @return
     */
    @RequestMapping(value = "greeting",method = RequestMethod.POST)
    public String showGreeting(@ModelAttribute Greet greet) {
        return "result";
    }
}
