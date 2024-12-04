package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Merch;
import com.generation.jbay.model.entities.Seller;
import com.generation.jbay.model.repositories.MerchRepository;
import com.generation.jbay.model.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/merchandise")
public class MerchController
{
	@Autowired
	private ControllerHelper helper;

	@PostMapping("/a")
	public String addMerch(@ModelAttribute Merch merch, @RequestParam int seller_id)
	{
		helper.saveMerch(merch,seller_id);
		return "redirect:/merchandise";
}

	@GetMapping
	public String returnMerch(Model model)
	{
		List<Merch> all= helper.findAllMerch();
		model.addAttribute("merchs", all);

		return "merchs";
	}
}
