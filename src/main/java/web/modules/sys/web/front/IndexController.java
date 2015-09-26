package web.modules.sys.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {

    public String index(){
        return "modules/sys/index";
    }
}
