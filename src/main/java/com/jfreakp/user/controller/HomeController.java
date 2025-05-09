package com.jfreakp.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Página de Inicio");
        model.addAttribute("message", "¡Bienvenido a tu primera página con Spring Boot y Thymeleaf!");
        return "index";  // Busca el template 'index.html'
    }
}
