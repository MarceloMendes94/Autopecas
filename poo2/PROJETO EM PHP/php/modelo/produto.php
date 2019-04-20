<?php
    require_once('fabricante');
    class Produto extends Fabricante{
        public $numero_peca;
        public $altura;
        public $largura;
        public $comprimento;
        public $diamentroInterno;
        public $diamentroExterno;
    }
?>