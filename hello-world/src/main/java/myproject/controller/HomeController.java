package myproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to expose views over http
 * @author varundora
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/releasenote")
    public String home() {
        return "release-note";
    }
}
