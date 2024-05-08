package in.ruchi.demo20240507;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi{

    @RequestMapping("/hello")
    public String sayHello(){
        return  "Hello Class!!";
    }
}