package com.asdeire.springsecurityapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/private")
    @PreAuthorize("isAuthenticated()")
    public String privatePage(Model model) {
        model.addAttribute("message", "Ця сторінка доступна лише для авторизованих користувачів.");
        return "private";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminPage(Model model) {
        model.addAttribute("message", "Ця сторінка доступна лише для адміністратора.");
        return "admin";
    }
}

