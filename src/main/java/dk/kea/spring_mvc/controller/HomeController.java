package dk.kea.spring_mvc.controller;

import dk.kea.spring_mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model)
    {
        //add all animals to view model from animalService
        model.addAttribute("prdct", productService.readAll());
        return("index");
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    /*@PostMapping("/create")
    public String create(@ModelAttribute Product prdt){
        productService.create(prdt);
        return "redirect:/";
    }*/

}
