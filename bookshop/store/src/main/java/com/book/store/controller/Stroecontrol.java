package com.book.store.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.store.entity.Entitiystore;
import com.book.store.serv.Storeserv;

@Controller
public class Stroecontrol {
	
	@Autowired
	private Storeserv service;
	
	@GetMapping("/store")
	public String home () {
		return "home";
	}
	
	@GetMapping("/reg")
	public String reg() {
		return "bookreg";
	}
	@GetMapping("/bookedit")
	public String bookedit() {
		return "update";
	}
	@GetMapping("/booklist")
    public ModelAndView Allbooks()
    {
		List<Entitiystore>list=service.Allbooks();
		return new ModelAndView("booklist","book",list);
    }
	@GetMapping("/delet")
	public String delet()
	{
		return "deletebook";
	}

	@PostMapping("/send")
		public String send(@ModelAttribute Entitiystore s) {
		service.save(s);
		return "done";
			
		}
	@RequestMapping("/getvalue/{id}")
	public String editbook(@PathVariable("id")int id,Model model) {
		Entitiystore ent=service.updatecode(id);
		model.addAttribute("Entitystore", ent);
		return "redirect:/booklist";
	}
	
	@RequestMapping("/deletbook/{id} ")
	public String deletbook(@PathVariable("id")int id) {
		service.deletcode(id);
		return "redirect:/booklist";
	}
	

	
	
	
}
