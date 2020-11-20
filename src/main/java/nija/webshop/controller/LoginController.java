package nija.webshop.controller;
import nija.webshop.model.User;
import nija.webshop.repository.UserJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    UserJpaRepository userRepository;

    public LoginController(UserJpaRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model, HttpSession session) {
        List<User> users = (List<User>) userRepository.findAll();
        for (User temp : users) {
            if (user.getUserName().equals(temp.getUserName())) {
                session.setAttribute("isLogin", "yes");
                model.addAttribute("items", userRepository.findAll());
                return "redirect:/";
            }
        }
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("isLogIn");
        if(session.getAttribute("isLogIn") != null){
            return "indexIsLogin";
        }
        return "index";
    }
}