package com.hehe.integration.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static javafx.scene.input.KeyCode.R;

@RestController
@RequestMapping("/user/*")
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public R list() {
        try {
           return R.isOk().data(userService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }

    }

}