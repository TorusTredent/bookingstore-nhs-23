package com.example.bookstore23.controllers;


import com.example.bookstore23.dto.ProfileDTO;
import com.example.bookstore23.entity.User;
import com.example.bookstore23.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        User user1 = userService.getByUserName(user.getUserName());
        ProfileDTO profileDTO = userService.mapUserToProfileDto(user1);
        model.addAttribute("user", profileDTO);
        return "/profile";
    }

    @PostMapping("/profile")
    public String profile(@ModelAttribute(value = "user") ProfileDTO profileDTO, Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        User user1 = userService.getByUserName(user.getUserName());
        userService.mapProfileDTOToUser(user1, profileDTO);
        userService.save(user1);
        session.setAttribute("user", user1);
        model.addAttribute("message", "Обновление произошло успешно");
        model.addAttribute("user", profileDTO);
        return "/profile";

    }

    @GetMapping("/test")
    public String test (HttpSession session){
        User user= User.builder()
                .userName("Женя").password("1").build();
        User user1=userService.save(user);
        session.setAttribute("user",user1);
        return "redirect:/user/profile";
    }
}