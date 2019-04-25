<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Fabricante
 *
 * @author marcelo
 */
class Fabricante {
    //put your code here
    public $marca;
    public $numero_oem;
        
        function Fabricante($marca, $numero_oem){
            $this->marca       = $marca;
            $this->numero_oem  = $numero_oem;
        } 
}
?>