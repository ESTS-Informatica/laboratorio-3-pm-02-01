
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
  private Integer numberOfPallets;
  private Integer trailers;
    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(Integer numberOfPallets,Integer trailers,String licencePlate){
    this.numberOfPallets = numberOfPallets;
    this.trailers = trailers;
    super.setLicencePlate(licencePlate);
    }

        
      public Integer getNumberOfPallets(){
        return this.numberOfPallets;
    }
    
    
    public void setNumberOfPallets(Integer numberOfPallets){
    
        this.numberOfPallets = numberOfPallets;
        
    }
    
          public Integer getTrailers(){
        return this.trailers;
    }
    
    
    public void setTrailers(Integer trailers){
    
        this.trailers = trailers;
        
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
