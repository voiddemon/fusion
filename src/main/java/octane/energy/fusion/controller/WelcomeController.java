package octane.energy.fusion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @ResponseBody
    @RequestMapping(value = "/welcome")
    public String welcomeMessage() {
        return "Welcome to my application";
    }


}


