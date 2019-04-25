<?php
    require_once ('produto');
    class Rotor extends Produto{

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