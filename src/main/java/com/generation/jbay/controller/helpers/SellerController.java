package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Seller;
import com.generation.jbay.model.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/seller")
public class SellerController
{
	@Autowired
	private ControllerHelper helper;

	@PostMapping
	public String addSeller(@ModelAttribute Seller seller){
		helper.saveSeller(seller);
		return "redirect:/seller";
	}

	@GetMapping
	public String returnSeller(Model model)
	{
		List<Seller> all = helper.findAllSellers();
		model.addAttribute("seller", all);

		return "sellers";
	}

}
