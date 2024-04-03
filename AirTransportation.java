
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
   

    
   
}
