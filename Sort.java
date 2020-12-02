package Sorting;
import exercises._2.Member;

public class Sort {
    
   public void sorting(Member A, Member B, Member C, Member D) {
        
        Member[] array = {A, B, C, D};
        
        boolean sorted = false;
        Member temp;
      
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < (array.length)-1; i++) {
                if (array[i].getYear() > array[i+1].getYear()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
                else if (array[i].getYear() == array[i+1].getYear() && array[i].getMonth() > array[i+1].getMonth()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
                if (array[i].getYear() == array[i+1].getYear() && array[i].getMonth() == array[i+1].getMonth() && array[i].getDay() > array[i+1].getDay()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        
        System.out.println("\n\n===SORTED BY ENTRY DATE===");
        for(Member p:array) {
            p.info();  
    }
}
}
    
