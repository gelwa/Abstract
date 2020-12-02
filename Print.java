package Printing;
import exercises._2.Member;

public class Print {
    
    public void printing(Member A, Member B, Member C, Member D) {
        
        Member[] array = {A, B, C, D};
        
        boolean sorted = false;
        Member temp;
      
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < (array.length)-1; i++) {
                if (array[i].getId() > array[i+1].getId()) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
            }
        }
        }
        
        System.out.println("\n\n===SORTED BY ID===");
        for(Member p:array) {
            p.info();  
        }
    }
}
    
