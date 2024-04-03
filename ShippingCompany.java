import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService; 
    
    
    
    public ShippingCompany(String name)
    {
    this.name = name;
    }

    public String getName(){
    return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Transport> getInService(){
        return this.inService;
    }
    
        public void setInService(ArrayList<Transport> inService){
        this.inService = inService;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
         this.forEach(inService -> sb.append(String.format("\n%15s: %s\n", "Veiculo", inService)));
         return sb.toString();
       
        

    }
}
