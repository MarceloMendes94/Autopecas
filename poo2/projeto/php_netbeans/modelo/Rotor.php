<?php
require_once 'Produto.php';
require_once 'Fabricante.php';
require_once 'interface/rotor_interface.php';

class Rotor extends Produto implements rotor_interface {
    //put your code here  
    
        function Rotor($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem){
            $this->numero_peca      = $numero_peca;
            $this->altura           = $altura;
            $this->largura          = $largura;
            $this->comprimento      = $comprimento;
            $this->diamentroInterno = $diamentroInterno;
            $this->diamentroExterno = $diamentroExterno;
            $this->amperagem        = $amperagem;
            $this->voltagem         = $voltagem;
            $this->valor            = $valor;          
            $this->fabricante       = new Fabricante($marca, $numero_oem);
        }
}
?>