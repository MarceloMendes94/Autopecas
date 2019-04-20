<?php
    require_once('../modelo/cliente.php');
    $nome       =$_GET["nome"];
    $sobrenome  =$_GET["sobrenome"];
    $cpf        =$_GET["cpf"];
    $cep        =$_GET["cep"];
    $logradouro =$_GET["logradouro"];
    $complemento=$_GET["complemento"];
    $referencia =$_GET["referencia"];
    $cliente = new Cliente($logradouro ,$cep, $numero, $complemento, $referencia,$nome,$cpf,$sobrenome);
    echo $cliente;
?>