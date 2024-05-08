package in.ruchi.demo20240507;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi{

    @RequestMapping("/hello")
    public String sayHello(){
        return  "Hello Class!!";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloName(@PathVariable("name") String name){
        return  "Hello " +name +" !!";
    }
}