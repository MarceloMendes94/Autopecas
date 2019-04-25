<?php

    class Conta{
        public $numero;
        public $agencia;
        public $nome_banco;
        public $digito;

        function Conta($numero,$agencia,$nome_banco,$digito){
            $this->numero       = $numero;
            $this->agencia      = $agencia;
            $this->nome_banco   = $nome_banco;
            $this->digito       = $digito;
        }

    }

?>