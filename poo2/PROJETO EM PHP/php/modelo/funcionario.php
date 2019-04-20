<?php 
    require_once('pessoa.php');
    class Funcionario extends Pessoa{

        function Funcionario($nome,$sobrenome,$cpf ){
            $this->nome     = $nome;
            $this->sobrenome= $sobrenome;
            $this->cpf      = $cpf;    
        }
    }
?>