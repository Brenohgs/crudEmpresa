package com.example.crudSpring.projetoCRUD.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.SERVICE.EmpresaService;

import aj.org.objectweb.asm.Attribute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




    
    
@Controller
@RequestMapping("/empresaCTR") //CTR representa a clase controller 
public class EmpresaController {
       
        private final EmpresaService empresaService;
    
        //processo de instaciação de classe
        public EmpresaController(EmpresaService ligacaoEmpresaService){
            this.empresaService = ligacaoEmpresaService;
        }
    
        //chamada para listar todas as empresas
        @GetMapping("/listarTodasEmpresas")
        public String listarEmpresas(Model oModel) {
            oModel.addAttribute("empresas", empresaService.findAll());
            return "listarEmpresa";
        }
        
        @GetMapping("/viewCadEmpresa")      // "oModel = objetoModel" nome da classe model
        public String mostrarFormCadastro(Model oModel) {
            oModel.addAttribute("empresa", new Empresa());
            return "cadastroEmpresa";
        }
        
        @PostMapping("/salvarEmpresa")
        public String salvarEmpresa(@ModelAttribute Empresa objEmpresa){
            //chamando o método cadastrar e passando
            //o objeto (pacotinho) com os dados que precisam ser salvos
            empresaService.cadastrarEmpresa(objEmpresa);
            return "redirect:/empresaCTR/listarTodasEmpresas";
        }
        
    
}
