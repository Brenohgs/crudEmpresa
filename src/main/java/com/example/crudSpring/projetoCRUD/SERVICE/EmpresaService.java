package com.example.crudSpring.projetoCRUD.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudSpring.projetoCRUD.ENTITY.Empresa;
import com.example.crudSpring.projetoCRUD.REPOSITORY.EmpresaRepository;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;
        //metodo construtor da classe EmpresaService
        //crindo uma ligação com a classe EmpresaRepository
    public EmpresaService(EmpresaRepository ligacaoEmpresaRepository){
        empresaRepository = ligacaoEmpresaRepository;
    }

    //SELECTS OU INSERTS OU ALTER TABLE OU DELETE
    //"SELECT * FROM EMPRESA" - SELECT REALIZA LISTAGEM DE DADOS (retorna tudos os dados da empresa (* = tudo da tabela))

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }//select * from empresa

    public Empresa cadastrarEmpresa(Empresa dadoEmpresa){
            return empresaRepository.save(dadoEmpresa);
    }

    public void deletarEmpresa(Empresa dadoEmpresa){
        empresaRepository.delete(dadoEmpresa);
    }//Esse comando é "void" pq não precisa de nenhum rotorno

    public Optional<Empresa> buscaPorId(long id){
        return empresaRepository.findById(id);
    }//realizar a busca de dados no banco usando
     //o id criado da classe

     public Empresa editarDadosEmpresa(Long id, Empresa dadosAtualizados){
        return null;
     }
}
