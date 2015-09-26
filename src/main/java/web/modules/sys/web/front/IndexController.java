package web.modules.sys.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "{$adminPath}")
@Controller
public class IndexController {
    @RequestMapping(value = { "list", "" })
    public String index(){
        return "modules/sys/index";
    }
}
