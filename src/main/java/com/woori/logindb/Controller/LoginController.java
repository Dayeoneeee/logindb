package com.woori.logindb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String IndexForm() {
        return "index";
    }

    @GetMapping("/result")
    public String ResultForm() {    //모든 사용자 접근 가능
        return "result";
    }

    @GetMapping("/user")
    public String UserForm() {  //USER 권한자만 접근 가능
        return "user";
    }

    @GetMapping("/admin")
    public String AdminForm() { //ADMIN 권한자만 접근 가능
        return "admin";
    }

}
