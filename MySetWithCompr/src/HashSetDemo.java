
import java.util.Iterator;
import java.util.LinkedHashSet;


public class HashSetDemo {
    
    public static void main(String args[]){
    
    //create a hash set
        LinkedHashSet<Integer> hs = new LinkedHashSet();
        
        //add elemnts to the hash set
    
    hs.add(10);
    hs.add(5);
    hs.add(6);
    hs.add(7);
    hs.add(4);
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(8);
    hs.add(9);
    
        Iterator hs2 = hs.iterator();
        
        while(hs2.hasNext()){
            System.out.print(hs2.next() + ",");
            

        }
        System.out.println("\n");
        
       for( Integer ob : hs){
            
            System.out.print(ob + ",");
                
          }
    
    }
    
    
    
}
