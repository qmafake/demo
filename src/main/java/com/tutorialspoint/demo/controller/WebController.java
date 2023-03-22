package com.tutorialspoint.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
   @RequestMapping(value = "/index")
   public String index() {
      return "index/index";
   }

   @RequestMapping("/books")
   public String getBooks(Model model ) {

      model.addAttribute("books", null);

      return "books/list"; //this searches templates directory for a template called list (list.html)
   }

}