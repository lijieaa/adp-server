package web.modules.sys.web.front;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import websocket.Greeting;
import websocket.HelloMessage;

import javax.xml.transform.Result;

@Controller
@RequestMapping("ws")
public class WebsocketController {
    @RequestMapping("index")
    public String index(){
        return "modules/websocket/index";
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }
}
