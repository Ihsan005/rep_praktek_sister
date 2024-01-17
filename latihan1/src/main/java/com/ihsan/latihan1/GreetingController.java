/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ihsan.latihan1;

import org.springfremwork.stereotype.Controller;
import org.springfremwork.ui.Model;
import org.springfremwork.web.bind.annotation.GetMapping;
import org.springfremwork.web.bind.annotation.RequestParam;

        
public class GreetingController {
    @getMapping("/greeting")
        public String greeting(@RequestParam(name="name",
                required=false, defauldValue="World") Sting name,Model model){
                model.addAttribute("name", name);
                return "greeting";
        }
}
