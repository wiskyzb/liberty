package cn.tedu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Value("${user.username}")
    private String userName;
    @GetMapping("/test")
    public String demo(){
        System.out.println(userName);
        return userName;
    }
}
