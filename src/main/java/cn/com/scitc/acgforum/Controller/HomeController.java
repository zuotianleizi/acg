package cn.com.scitc.acgforum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/hello")
public class HomeController {
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute(name);
        return "hello";
    }
}
