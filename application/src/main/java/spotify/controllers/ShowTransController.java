package spotify.controllers;

import org.springframework.web.bind.annotation.PostMapping;

public class ShowTransController {
	
	@PostMapping("/homePage")
    public String showHomedPage() {
        return "homePage"; 
    }
}
