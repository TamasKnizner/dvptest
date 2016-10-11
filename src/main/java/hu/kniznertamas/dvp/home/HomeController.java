package hu.kniznertamas.dvp.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public static final String REQUEST_MAPPING = "/";

    @RequestMapping(REQUEST_MAPPING)
    public String homepage() {
        System.out.println("HOMEPAGE MAPPING");
        return "homepage";
    }

}
