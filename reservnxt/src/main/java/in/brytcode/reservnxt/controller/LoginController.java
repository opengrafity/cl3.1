package in.brytcode.reservnxt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @RequestMapping("/login/oauth")
    public String login(HttpServletRequest req){
        System.out.println("Logged In Successfully");
        return "Success";
    }
}
