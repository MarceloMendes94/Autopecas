<?php 
      require_once('pessoa.php');
      require_once('endereco.php');
      require_once('cartao.php');
      class Cliente extends Pessoa {
         public $endereco;
         public $cartao;
         public $email;

         function Cliente($logradouro ,$cep, $numero, $complemento, $referencia,$nome,$sobrenome,$n1,$n2,$n3,$n4,$email,$numero_cartao,$nome_titular,$vencimento,$bandeira){
            $this->nome       = $nome;
            $this->email      = $email;
            $this->sobrenome  = $sobrenome;
            $this->cpf        = new Cpf($n1,$n2,$n3,$n4);
            $this->endereco   = new Endereco($logradouro,$cep,$numero,$complemento,$referencia);    
            $this->cartao     = new Cartao($numero_cartao,$nome_titular,$vencimento,$bandeira);   
         }
      }
?>
