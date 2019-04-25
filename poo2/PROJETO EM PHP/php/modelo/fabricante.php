<?php 
    class Fabricante {
        public $marca;
        public $numero_oem;
        
        function Fabricante($marca, $numero_oem){
            $this->marca       = $marca;
            $this->numero_oem  = $numero_oem;
        } 
    }
?>