package nija.webshop.controller;

import nija.webshop.model.Item;
import nija.webshop.repository.ItemJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class WebShopController {

    ItemJpaRepository itemRepository;

    public WebShopController(ItemJpaRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
    public String index(@ModelAttribute Item items, Model model, HttpSession session){
        model.addAttribute("items", itemRepository.findAll());
        if(session.getAttribute("isLogin") != null){
            return "indexIsLogin";
        }
        return "index";
    }

//    @PostMapping
//    public String index(){
//        return "productPage";
//    }

    @GetMapping("/productPage")
    public String productPage(@RequestParam("id") int id, Model model){
        Optional<Item> temp = itemRepository.findById(id);
        model.addAttribute("item", temp);
        return "productPage";
    }
}