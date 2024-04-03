
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
   private Integer packages;
    public Van(Integer packages,String licencePlate)
    {
     this.packages = packages;
     super.setLicencePlate(licencePlate);
    }

        
      public Integer getPackages(){
        return this.packages;
    }
    
    
    public void setPackages(Integer packages){
    
        this.packages = packages;
        
    }
    
    
        @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino",super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", super.getHonorarios()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", super.getPriceWithFees()));
     
        return sb.toString();
    }
   
}
