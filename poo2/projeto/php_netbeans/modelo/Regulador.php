<?php
require_once 'Produto.php';
require_once 'Fabricante.php';
require_once 'interface/regulador_interface.php';
/**
 * Description of Regulador
 *
 * @author marcelo
 */
class Regulador extends Produto implements regulador_interface{
    //put your code here
     function Regulador($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem){
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