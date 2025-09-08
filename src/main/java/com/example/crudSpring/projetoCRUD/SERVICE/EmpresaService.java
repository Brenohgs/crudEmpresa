package com.example.crudSpring.projetoCRUD.SERVICE;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;
        //metodo construtor da classe EmpresaService
        //crindo uma ligação com a classe EmpresaRepository
    public EmpresaService(EmpresaRepository ligacaoEmpresaRepository){
        empresaRepository = ligacaoEmpresaRepository;
    }

}
