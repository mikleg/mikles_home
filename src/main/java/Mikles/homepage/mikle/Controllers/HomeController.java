package Mikles.homepage.mikle.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

        @RequestMapping(value = "")
        public String index(Model model) {

            model.addAttribute("title", "first title");

            return "index";
        }


    }
