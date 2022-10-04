package se.lexicon.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
    Home home = new Home();
    List<String> contactList = new ArrayList<>();
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @PostMapping("/contact")
    public String contact(@RequestParam String contact){
        contactList.add(contact);
        return "contact";
    }
    @GetMapping("/registered")
    public String contactList(Model model){
        model.addAttribute("list", contactList);
        return "registered";
    }
}
