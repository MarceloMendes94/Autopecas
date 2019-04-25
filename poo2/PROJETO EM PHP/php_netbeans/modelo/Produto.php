<?php
require_once 'Fabricante.php';

/**
 * Description of Produto
 *
 * @author marcelo
 */
class Produto {
    //put your code here
    public $numero_peca;
    public $altura;
    public $largura;
    public $comprimento;
    public $diamentroInterno;
    public $diamentroExterno;
    public $amperagem;
    public $voltagem;
    public $valor;
    public $fabricante;

        function Produto($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem ){
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