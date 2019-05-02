<?php
    require_once('produto.php');
    //interface
    require_once('fabrica_produtos.php');
    class Regulador extends Produto{

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