<?php
require_once 'Produto.php';
require_once 'Fabricante.php';
require_once 'interface/polia_interface.php';
class Polia extends Produto implements polia_interface{
     public $qte_sulcos;
        function Polia($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$qte_sulcos){
            $this->numero_peca      = $numero_peca;
            $this->altura           = $altura;
            $this->largura          = $largura;
            $this->comprimento      = $comprimento;
            $this->diamentroInterno = $diamentroInterno;
            $this->diamentroExterno = $diamentroExterno;
            $this->amperagem        = $amperagem;
            $this->voltagem         = $voltagem;
            $this->valor            = $valor;
            $this->qte_sulcos       = $qte_sulcos;             
            $this->fabricante       = new Fabricante($marca, $numero_oem);
        } 
}
?>