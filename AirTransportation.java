
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    
    private String name;
    private Integer numberOfContainers;
    private double honorarios = 0.04;
    
    public AirTransportation(String name,Integer numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
     public double getHonorarios(){
        return this.honorarios;
    }
    
    
    public void setHonorarios(double honorarios){
    
        this.honorarios = honorarios;
        
    }
    
    
     public String getName(){
    return this.name;
    }
    
    public Integer getNumberOfContainers(){
    return this.numberOfContainers;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumberOfContainers(Integer numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    @Override
        public double getPriceWithFees() {     
        return super.getPrice() * (1.0 +  honorarios);
    }
    
        @Override
        public String getTransportType() {
        return "Transporte Aereo";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino",super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getHonorarios()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
        

   

    
   
}
