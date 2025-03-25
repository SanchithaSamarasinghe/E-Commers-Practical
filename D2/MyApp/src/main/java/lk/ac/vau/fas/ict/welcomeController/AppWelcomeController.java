package lk.ac.vau.fas.ict.welcomeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppWelcomeController {
	@GetMapping("/msg3")
    public String myMessage1() {
        return "Welcome!";
    }	
}
