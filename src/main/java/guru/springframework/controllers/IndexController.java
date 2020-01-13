package guru.springframework.controllers;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
public class IndexController {

    public IndexController() {
    }

    @RequestMapping({ "/", "/index" })
    public String index(){
        log.debug("coming in");
        return "index";
    }

    @RequestMapping({ "/new", "/test" })
    public String returnIndex(){
        log.debug("coming in");
        return "Home";
    }
}
