
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private double honorarios = 0.03;
    
    public GroundTransportation(String licencePlate)
    {
      
    }
    
        public String getLicencePlate(){
        return this.licensePlate;
    }
    
    
    public void setLicencePlate(String licencePlate){
    
        this.licensePlate = licensePlate;
        
    }
    
    @Override
        public double getPriceWithFees() {     
        return super.getPrice() * (1.0 +  honorarios);
    }
    
        @Override
        public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino",super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.honorarios));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
    
    

}
