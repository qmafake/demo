package com.tutorialspoint.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

   @RequestMapping("/view-products")
   public String viewProducts() {
      return "view-products";
   }

   @RequestMapping("/add-products")
   public String addProducts() {
      return "add-products";
   }
}