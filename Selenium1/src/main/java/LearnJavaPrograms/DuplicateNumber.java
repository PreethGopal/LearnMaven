package LearnJavaPrograms;
import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
    public int findDuplicateNumber(List<Integer> numbers){
    	
         for(int i :numbers) {
        	 System.out.print(i);
         }
        	 
    	DuplicateNumber.test2();
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
                
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
    	
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=1;i<30;i++){
        	
            list.add(i);
        }
        //add duplicate number into the list
        list.add(22);
        
        DuplicateNumber.test();
        
        System.out.println(DuplicateNumber.a);
        
        DuplicateNumber dn = new DuplicateNumber();
        
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(list));
    }

    static int a=10;

public static void test() {	
	
	System.out.println("test method");
}


public static void test2() {	
	
	System.out.println("test2 method");
}










}