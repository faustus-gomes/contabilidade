package br.com.netgom.Contabilidade.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.netgom.Contabilidade.Models.ContabilidadeModel;
import br.com.netgom.Contabilidade.Service.ContabilidadeService;

@Controller
@RequestMapping("/") //localhost:8080/home
public class ContabilidadeController {
	
	@Autowired
	private ContabilidadeService contabService;
	
	@RequestMapping("home")
	public String index(Model model) {	
		List<ContabilidadeModel> listContab = contabService.listAll();
		//model.addAllAttribute("listContab", listContab);
		model.addAttribute("listContab", listContab);
		
	    return "home";
	}
	
	@RequestMapping("login")
	public String login(Model model) {	
		List<ContabilidadeModel> listContab = contabService.listAll();
		//model.addAllAttribute("listContab", listContab);
		model.addAttribute("listContab", listContab);
		
	    return "login";
	}

}



