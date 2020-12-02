package exercises._2;
import Printing.Print;
import Sorting.Sort;

public class Main {
    
    public static void main (String args[]) {
        
        Professor snape = new Professor();
        snape.setMember("Severus", "Snape", 1, 50, 1, 6, 2000);
        snape.setDegree("Master");
        
        Professor dumbledore = new Professor();
        dumbledore.setMember("Albus", "Dumbledore", 2, 75, 1, 1, 1980);
        dumbledore.setDegree("Master");
        
        Student harry = new Student();
        harry.setMember("Harry", "Potter", 3, 20, 1, 1, 2007);
        harry.setDegree("Bachelor");
        
        Tutor hagrid = new Tutor();
        hagrid.setMember("Rebeus", "Hagrid", 4, 52, 3, 1, 2000);
        hagrid.setDegree("no");
        
        hagrid.count();
       
        Print print = new Print();
        print.printing(harry, snape, dumbledore, hagrid);
        
        Sort sort = new Sort();
        sort.sorting(harry, snape, dumbledore, hagrid);
        
        
    }
    
}
