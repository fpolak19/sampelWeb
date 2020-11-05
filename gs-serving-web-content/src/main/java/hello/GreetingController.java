package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="parm1", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", "Filip");
        model.addAttribute("olllo", "Ala ma kota");
        model.addAttribute("home ", "how are you");
        return "greeting";
    }

    @GetMapping("/byebye")
    public String byeBye(Model model) {
        return "byeBye";
    }

    @GetMapping("/home")
    public String home (Model model){
        return "home";
    }
    @GetMapping("/map")
    public String map (Model model){
        return "map";
    }
}
