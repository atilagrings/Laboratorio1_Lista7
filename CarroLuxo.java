public class CarroLuxo extends Carro{
    private boolean arCondicionado;
    
    public CarroLuxo (){
        super();
        this.arCondicionado = false;
    }
    
    public CarroLuxo (double totalComb, double totalConsumoPorKm, int KmRodado){
        super(totalComb, totalConsumoPorKm, KmRodado);
        this.arCondicionado = false;}
        
    public void ligaAr(){
        this.arCondicionado = true;
    }
    
    public void desligaAr(){
        this.arCondicionado = false;
    }
    
    public boolean getStatusArcondicionado(){
        return this.arCondicionado;
    }
}
