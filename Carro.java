public class Carro {
    private double comb; // total de combustivel no tanque
    private double cons; // consumo de combustivel por quilometro
    private int cont; // contador de quilometragem percorrida

 public Carro() {
     this.comb = 0; // carro de tanque vazio
     this.cont = 0; // carro zero quilometro
     this.cons = 10; // consome 1 litro de combustível a cada 10 km
 }
 
 public Carro ( double c, double consumo, int kM ) {
     if ( c > 55 )
        this.comb = 55; // o reservatorio do tanque é limitado em 55 litros
     else this.comb = c;
        this.cont = kM;
     setConsumo (consumo);
 }
 
 public double getCombustivel(){
     return comb;
    }
    
 public int getKmRodado(){
     return cont;
    }
 
 public void setConsumo( double c ) {
     if (c<= 0)
        this.cons = 10;
     else 
        this.cons = c;
 } 
 
 public double getConsumo() {
     return this.cons;
 }
 
 public boolean abastece( double litros ) {
     if ( (litros + this.comb) > 55 ) // quantidade de combustivel não cabe no tanque?
        return false;
     else {
         this.comb = this.comb + litros; // caso caiba, abastece
         return true;
     }
 }

 public boolean anda( int q ) {
     int qtKm = (int)(this.comb * this.cons); //qtdade de quilometros que podem ser percorridos
     if ( qtKm < q )
        return false; // nao ha combustivel suficiente para andar q quilometros
     else {
         double gasto = q /cons; // quanto gasta de combustível
         this.comb = this.comb - gasto; //consome combustivel
         cont = cont + q; // atualiza contador de quilometros
         return true; // o carro andou
     }
 } 
 
 public String status() {
     String s = "\nO carro já percorreu " + this.cont + " Quilometros "+
     "\nTem no tanque " + this.comb +" litros de combustivel "+
     "\nPode andar: " + this.cons * this.comb +
     " quilometros com o combustivel disponivel"+
     "\nO carro faz " + this.cons + " Quilometros por litro";
     return s;
 }
 
}