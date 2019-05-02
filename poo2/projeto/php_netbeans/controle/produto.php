<?php
    require_once '../modelo/Fabrica.php';

    $numero_peca        =$_POST["numeropeca"];
    $altura             =$_POST["altura"];
    $largura            =$_POST["largura"];
    $comprimento        =$_POST["comprimento"];
    $diamentroInterno   =$_POST["diametrointerno"];
    $diamentroExterno   =$_POST["diametroexterno"];
    $amperagem          =$_POST["amperagem"];
    $voltagem           =$_POST["voltagem"];
    $valor              =$_POST["valor"];
    $marca              =$_POST["marca"];
    $numero_oem         =$_POST["oem"];
    $aux                =$_POST["aux"];
    $tipo               =$_POST["tipo"];

    //$bobina = new Bobina($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$aux);
    $fabrica= new Fabrica();
    $bobina = $fabrica->fabricaAbs($numero_peca, $altura, $largura, $comprimento, $diamentroInterno, $diamentroExterno,$amperagem,$voltagem,$valor,$marca,$numero_oem,$aux,$tipo);
    
    
?>

