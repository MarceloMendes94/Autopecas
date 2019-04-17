<?php 
    require_once('pessoa.php');
     class Cliente extends Pessoa {
        public $logradouro;
        public $cep;
        public $numero;
        public $complemento;
        public $referencia;

        function Cliente($logradouro ,$cep, $numero, $complemento, $referencia,$nome,$cpf,$sobrenome){
           $this->logradouro    = $logradouro;
           $this->cep           = $cep;
           $this->numero        = $numero;
           $this->complemento   = $complemento;
           $this->referencia    = $referencia;
           $this->nome          = $nome;
           $this->cpf           = $cpf;
           $this->sobrenome     = $sobrenome;
        
        }
    }