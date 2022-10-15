package font.code.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/movie")
@Controller
public class MovieController {
	
	@GetMapping
	@ResponseBody
	public String helo() {
		return "Hello World";
	}
}
