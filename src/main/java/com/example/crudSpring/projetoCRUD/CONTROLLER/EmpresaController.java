package com.example.crudSpring.projetoCRUD.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.SERVICE.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



    
    
@Controller
@RequestMapping("/empresaCTR") //CTR representa a clase controller 
public class EmpresaController {
       
        private final EmpresaService empresaService;
    
        //processo de instaciação de classe
        public EmpresaController(EmpresaService ligacaoEmpresaService){
            this.empresaService = ligacaoEmpresaService;
        }
    
        
        @GetMapping("/viewCadEmpresa")      // "oModel = objetoModel" nome da classe model
        public String mostrarFormCadastro(Model oModel) {
            oModel.addAttribute("empresa", new Empresa());
            return "cadastroEmpresa";
        }
        
    
    
}
