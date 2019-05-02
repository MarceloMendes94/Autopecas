<?php
require_once 'Produto.php';
require_once 'Fabricante.php';

require_once 'interface/bobina_interface.php';
/**
 * Description of Bobina
 *
 * @author marcelo
 */
class Bobina extends Produto implements bobina_interface {
    //put your code here    
    public $qte_polos;

    function Bobina($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno, $amperagem, $voltagem, $valor, $marca, $numero_oem, $qte_polos){
        $this->numero_peca      = $numero_peca;
        $this->altura           = $altura;
        $this->largura          = $largura;
        $this->comprimento      = $comprimento;
        $this->diamentroInterno = $diamentroInterno;
        $this->diamentroExterno = $diamentroExterno;
        $this->amperagem        = $amperagem;
        $this->voltagem         = $voltagem;
        $this->valor            = $valor;
        $this->qte_polos        = $qte_polos;             
        $this->fabricante       = new Fabricante($marca, $numero_oem);
    }

}
?>