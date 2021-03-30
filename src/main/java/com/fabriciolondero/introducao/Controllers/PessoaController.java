package com.fabriciolondero.introducao.Controllers;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fabriciolondero.introducao.Models.PessoaModel;

@Controller
public class PessoaController 
{
	
	@RequestMapping("/pessoas")
	public ModelAndView listar()
	{
		Random rand = new Random();
		ArrayList<PessoaModel> lista = new ArrayList<PessoaModel>();
		
		for (int i = 0; i < 10; i++) 
		{
			lista.add(new PessoaModel("Pessoa " + rand.nextInt(), rand.nextInt(80)));
		}
		
		for (PessoaModel pessoaModel : lista) 
		{
			System.out.println(pessoaModel.toString());
		}
		
		ModelAndView view = new ModelAndView("pessoas");
		view.addObject("pessoas", lista);
		
		return view;
	}
	
	@GetMapping("/formulario")
	public String enviarForm(PessoaModel pessoa)
	{
		System.out.println(pessoa.toString());
		
		return "formulario";
	}
	
	@PostMapping("/formulario")
	public String processarForm(PessoaModel pessoa)
	{
		System.out.println(pessoa.toString());
		
		//código do banco
		
		return "resultado";
	}

}
