<?php 
    class Cartao{
        public $numero;
        public $nome_titular;
        public $vencimento;
        public $bandeira;

        function Cartao($numero,$nome_titular,$vencimento,$bandeira){
            $this->numero = $numero;
            $this->nome_titular = $nome_titular;
            $this->vencimento   = $vencimento;
            $this->bandeira     = $bandeira;
        }
    }
?>