package octane.energy.fusion.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FusionController {

    /**
     * Welcome Page Thymeleaf Return Web page
     * Dont use @ResponseBody Annotation
     */
    @GetMapping("/welcomePage")
    public String welcomePageLoad() {
        return "welcomePage";
    }

}
