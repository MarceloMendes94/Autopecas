<?php 
    require_once('pessoa.php');
    class Funcionario extends Pessoa{

        function Funcionario($nome,$sobrenome,$data_nasc,$n1,$n2,$n3,$n4 ){
            $this->nome             = $nome;
            $this->sobrenome        = $sobrenome;
            $this->data_nascimento  = $data_nasc;
            $this->cpf              = new Cpf($n1,$n2,$n3,$n4);    
        }

    }
?>