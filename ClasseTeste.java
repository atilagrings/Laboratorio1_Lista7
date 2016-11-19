public class ClasseTeste{
    public static void main (String[] args){
        Teclado t = new Teclado();
        Carro A,B,C;  //Objetos
        double NA1,NA2,NA3; // Variáveis para o construtor
        int NA4; //
        int numeroCarros;// Total de carros testados
      
        char opcaoSelecionada;
        
        do{
            numeroCarros = 100 + (int)(Math.random() * (1000-100));
            double totalConsumidoNormais=0;
            double totalConsumidoLuxo=0;
            int totalCarrosLuxo = 0;
            int totalCarrosNormais =0;
            int somaKmCarrosLuxo = 0;
            int somaKmCarrosNormais =0;
            int rodaramComArLigado = 0;
            
        for (int i =1; i<=numeroCarros;i++){
            NA1 =  60 + (int)(Math.random() * (100));// Comb. no tanque
            NA2 = 5 + (int)(Math.random() * (15));// Consumo do carro normal
            NA3 =  8 + (int)(Math.random() * (27));// Consumo do carro de luxo
            NA4 =  1 + (int)(Math.random() * (100));// Km percorrida
        
            if (i%2==0){
                A = new Carro(NA1,NA2,NA4);
                somaKmCarrosNormais+= A.getKmRodado();
                totalCarrosNormais++;
                totalConsumidoNormais+= (A.getKmRodado()/NA2);
            }
            else if (i%7==0) {
                A = new CarroLuxo(NA1,NA3,NA4);
                if (i%3==0 && i%7==0) ((CarroLuxo)A).ligaAr();
                somaKmCarrosLuxo+=A.getKmRodado();
                totalCarrosLuxo ++;
                if (((CarroLuxo)A).getStatusArcondicionado()) {
                    totalConsumidoLuxo+=(A.getKmRodado()/(NA3*1.10));
                    rodaramComArLigado++;}
                    else totalConsumidoLuxo+=(A.getKmRodado()/NA3);
            }
        }
        
        System.out.println ("\f----------------------------------------------------------------------------------------------");
        System.out.println ("RELATÓRIO GERAL DE KM");
        System.out.println ("\n");
        System.out.println ("Número de Veículos Disponíveis: "+numeroCarros+"  - ("+totalCarrosNormais+" Normais locados e "+totalCarrosLuxo+" de luxo locados)");
        System.out.println ("\nVeículos Normais: "+"\nTotal rodado: "+somaKmCarrosNormais+" Km"+"\nTotal Consumido (litros): "+totalConsumidoNormais);
        System.out.println ("\nVeículos de Luxo: "+"\nTotal rodado: "+somaKmCarrosLuxo+" Km"+"\nTotal Consumido (litros): "+totalConsumidoLuxo+"\n"+rodaramComArLigado+" Circularam com ar condicionado ligado");        
        System.out.println ("\nResumo da Frota:\nTotal de Veículos Locados: "+(totalCarrosNormais+totalCarrosLuxo)+"\nTotal Rodado: "+(somaKmCarrosNormais+somaKmCarrosLuxo)+" km"+"\nTotal Consumido (litros): "+(totalConsumidoLuxo+totalConsumidoNormais));
        System.out.println ("----------------------------------------------------------------------------------------------");
    
        opcaoSelecionada= Character.toUpperCase(t.leChar("\n\nDeseja gerar uma nova simulação [S-sim N-não] ? "));
            
        }while (opcaoSelecionada != 'N');
        System.out.println ("Operação finalizada pelo usuário");
    }
}
        