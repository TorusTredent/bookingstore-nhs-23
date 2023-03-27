package com.example.bookstore23.controller;

import com.example.bookstore23.entity.User;
import com.example.bookstore23.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/registration")
    public String registration() {
        return "registr";
    }

    @PostMapping("/registration")
    public String registr(String username, String password, Model model) {
        if (userService.existByUserName(username)) {
            model.addAttribute("message", "Пользаватель уже существует");
        } else {
            userService.save(User.builder()
                    .userName(username)
                    .password(password)
                    .build());
            return "redirect:/user/auth";
        }
        return "registr";
    }

    @GetMapping("/auth")
    public String authorization() {
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(String username, String password, Model model, HttpSession mod) {
        if (!userService.existByUserName(username)) {
            model.addAttribute("message", "Пользователя не существует");
        } else {
            User user = userService.findByUserName(username);
            if (user.getPassword().equals(password)) {
                mod.setAttribute("user", user);
                return "redirect:/";
            } else {
                model.addAttribute("message", "Данные введены не правильно");
            }
        }
        return "auth";
    }
}
