package com.sda.store.product;

import com.sda.store.commons.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findproduct")
    public ModelAndView findProduct(@RequestParam("nameFragment") String nameFragment, Model model){
        List<ProductDto> byNameFragment = productService.findByNameFragment(nameFragment);
        return new ModelAndView("findproduct", "products", byNameFragment);
    }

    @GetMapping("/find")
    public String findProduct2(){
        return "findproduct";
    }

}
