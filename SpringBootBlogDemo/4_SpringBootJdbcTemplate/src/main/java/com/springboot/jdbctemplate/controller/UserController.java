package com.springboot.jdbctemplate.controller;

import com.springboot.jdbctemplate.domain.JsonResult;
import com.springboot.jdbctemplate.domain.User;
import com.springboot.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-22 11:10
 * @Version:v1.0
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * @destirption 通过Id查询User
     * @param id
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<JsonResult> queryUserById(@PathVariable(value = "id") Integer id) {
        JsonResult jsonResult = new JsonResult();

        try {
            User user = userService.queryUserById(id);

            jsonResult.setResult(user);
            jsonResult.setStatus("success");
        } catch (Exception e) {
            jsonResult.setResult(e.getMessage());
            jsonResult.setStatus("success");
        }

        return ResponseEntity.ok(jsonResult);
    }

    /**
     * @destirption 查询所有User
     * @param
     * @return
     */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<JsonResult> queryUserById() {
        JsonResult jsonResult = new JsonResult();

        try {
            List<User> users = userService.queryAllUser();

            jsonResult.setResult(users);
            jsonResult.setStatus("success");
        } catch (Exception e) {
            jsonResult.setResult(e.getMessage());
            jsonResult.setStatus("success");
        }

        return ResponseEntity.ok(jsonResult);
    }

    /**
     * @destirption 添加User
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<JsonResult> addUser(@RequestBody User user) {
        JsonResult jsonResult = new JsonResult();

        Integer result = userService.addUser(user);
        if (result == 1) {
            jsonResult.setResult(result);
            jsonResult.setStatus("insert success");
        } else {
            jsonResult.setResult(result);
            jsonResult.setStatus("insert fail");
        }

        return ResponseEntity.ok(jsonResult);
    }

    /**
     * @destirption 删除User
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<JsonResult> deleteUser(@RequestBody User user) {
        JsonResult jsonResult = new JsonResult();

        Integer result = userService.deleteUser(user);
        if (result == 1) {
            jsonResult.setResult(user.getId());
            jsonResult.setStatus("delete success");
        } else {
            jsonResult.setResult(user.getId());
            jsonResult.setStatus("delete fail");
        }

        return ResponseEntity.ok(jsonResult);
    }

    /**
     * @destirption 更新User
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<JsonResult> updateUser(@RequestBody User user) {
        JsonResult jsonResult = new JsonResult();

        Integer result = userService.updateUser(user);
        if (result == 1) {
            jsonResult.setResult(user.getId());
            jsonResult.setStatus("updateUser success");
        } else {
            jsonResult.setResult(user.getId());
            jsonResult.setStatus("updateUser fail");
        }

        return ResponseEntity.ok(jsonResult);
    }
}
