package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuotesController {
	
	@Autowired
	private QuoteService quoteService;
	
	@GetMapping("/quotesPage")
	public String  display_Quotes(Model model)
	{
		String quote = quoteService.show_quote();
		model.addAttribute("Proverb", quote);
		return "quotes_page";
		
	}

}
