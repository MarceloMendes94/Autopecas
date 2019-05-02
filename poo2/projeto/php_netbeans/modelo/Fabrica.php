<?php
require_once 'Bobina.php';
require_once 'Polia.php';
require_once 'Regulador.php';
require_once 'Rotor.php';
require_once 'Rolamento.php';

class Fabrica {
    //put your code here
    public function fabricaAbs($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$aux,$tipo){
        if($tipo=='bobina'){
            $bobina = new Bobina($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$aux);
            var_dump($bobina);
            return $bobina;
        }
        else if($tipo=='polia'){
             $polia = new Polia($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$aux);
             var_dump($polia);
             return $polia;
        }
        else if($tipo=='regulador'){
            $regulador = new Regulador($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem);
            var_dump($regulador);
            return $regulador;        
        }
        else if($tipo=='rotor'){
            $rotor = new Rotor($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem);
            var_dump($rotor);
            return $rotor;            
        }
        else if($tipo=='rolamento'){
            $rolamento= new Rolamento($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem);
            var_dump($rolamento);
            return $rolamento;
        }
        else
        {
            echo "erro";
            return NULL;
        }
    }
    
}
?>
