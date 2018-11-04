package com.springboot.validateform.controller;

import com.springboot.validateform.entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-21 22:13
 * @Version:v1.0
 */
@Controller
public class ValidateFormController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("results").setViewName("results");
    }

    /**
     * @Destription: 跳转到表单验证界面
     * @param personForm
     * @return
     */
    @RequestMapping("/")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    /**
     * @Destription: 表单校验
     * @param personForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/result";
    }

    /**
     * @Destription: 表单验证成功，跳转到result页面
     * @param personForm
     * @return
     */
    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String toResult(PersonForm personForm) {
        return "result";
    }


}
