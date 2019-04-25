<?php 
    class Endereco{
        public $logradouro;
        public $cep;
        public $numero;
        public $complemento;
        public $referencia;

        function Endereco($logradouro,$cep,$numero,$complemento,$referencia){
            $this->logradouro   =$logradouro;
            $this->cep          =$cep;
            $this->numero       =$numero;
            $this->complemento  =$complemento;
            $this->referencia   =$referencia;
        }
    }
?>