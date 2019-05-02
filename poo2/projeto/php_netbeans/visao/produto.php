<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>

    <div class="row">
        <div class="col s10 offset-s1">
            <form action="../controle/produto.php" method="post">
                <div class="card">
                    <div class="card-content">

                        <div class="col s4">
                            <h5>Informações do fabicante.</h5>
                        </div>
                        <div class="col s4">
                            <h5>Dados do produto</h5>
                        </div>    
                        <div class="col s4">
                            <h5>Especificação.</h5>
                        </div>
                        <br> 
                        <br>
                        <br>
                        <br> 
                        <div class="row">
                            <div class="input-field col s4 ">
                                <input placeholder="Nome" name="marca" type="text" class="validate">
                                <label >Nome do fabricante</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="R$ 99,99" name="valor" type="text" class="validate">
                                <label>Preço</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="em milimetros" name="altura" type="text" class="validate">
                                <label >Altura</label>
                            </div>
                        </div>


                        <div class="row">
                            <div class="input-field col s4 ">
                                <input placeholder="Número OEM" name="oem" type="text" class="validate">
                                <label >Número OEM</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder=""  type="text" name="amperagem" class="validate">
                                <label >Amperagem</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="em milimetros" name="largura" type="text" class="validate">
                                <label >Largura</label>
                            </div>
                        </div>

                        <div class="row">                            
                            <div class="input-field col s4 offset-s4">
                                <input placeholder=""  type="text" name="voltagem" class="validate">
                                <label >Voltagem</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="em milimetros" name="comprimento" type="text" class="validate">
                                <label >Comprimento</label>
                            </div>
                        </div>

                        <div class="row">                            
                            <div class="input-field col s4 offset-s4">
                                <input placeholder=""  type="text" name="numeropeca" class="validate">
                                <label >Numero da peça</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="em milimetros" type="text" name="diametrointerno" class="validate">
                                <label >diametro interno</label>
                            </div>
                        </div>
                        <div class="row">                            
                            <div class="input-field col s4 offset-s4">
                                <input placeholder="" id="aux"  type="text"  name="aux" class="validate">
                                <label  >Aux</label>
                            </div>
                            <div class="input-field col s4 ">
                                <input placeholder="em milimetros" type="text" name="diametroexterno" class="validate">
                                <label >diametro externo</label>
                            </div>
                        </div>

                        
                      <!--seletor-->
                            <label>Tipo do produto</label>
                            <select name ="tipo" class="browser-default">
                                <option value="bobina">Bobina</option>
                                <option value="polia">Polia</option>
                                <option value="rotor">Rotor</option>
                                <option value="rolamento">Rolamento</option>
                                <option value="regulador">Regulador</option>
                            </select>
                    </div>
                    <div class="card-action">
                    <button  type="submit" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">add</i></button>
                    </div>
                </div>                
                
            
                
            </form>
        </div>    
    </div>
    <script>
        function displayResult() {
            document.getElementById("myHeader").innerHTML = "Have a nice day!";
        }
    </script>


        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
              document.addEventListener('DOMContentLoaded', function() {
                var elems = document.querySelectorAll('select');
                var instances = M.FormSelect.init(elems, options);
            });

            // Or with jQuery

            $(document).ready(function(){
                $('select').formSelect();
            });
        </script>

    </body>
</html>
        
