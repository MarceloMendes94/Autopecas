<?php
    class Cpf{
        public $d1;
        public $d2;
        public $d3;
        public $d4;
        
        function Cpf($num1,$num2,$num3,$num4){
            $this->d1=$num1;
            $this->d2=$num2;
            $this->d3=$num3;
            $this->d4=$num4;
        }

        function validacao(){
            return 1;
        }

    }
?>