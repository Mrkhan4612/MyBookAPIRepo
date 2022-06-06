package in.mrKhan.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/wel/{name}")
    public String welcomeTest(@PathVariable String name)
    {
        return name;
    }
}
