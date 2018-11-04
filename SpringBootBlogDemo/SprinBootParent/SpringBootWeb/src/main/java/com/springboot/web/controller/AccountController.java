package com.springboot.web.controller;

import com.springboot.entity.common.R;
import com.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-23 22:03
 * @Version:v1.0
 */
@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("list")
    public R list() {
        try {
            return R.isOk().data(accountService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }

    }
}
