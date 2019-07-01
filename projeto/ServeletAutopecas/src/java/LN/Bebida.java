
package LN;
    public enum Bebida{
        CocaCola(2.00),
        Suco(1.50),
        Agua(1.00);

        private double preco;
  
        Bebida(double preco){
            this.preco = preco;
         }

        public double getPreco(){
            return this.preco;
        }
 }
