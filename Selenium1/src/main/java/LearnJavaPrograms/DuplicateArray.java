package LearnJavaPrograms;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    
                    //System.out.print("[" +my_array[i]+ "]" );
                 }
            }
        }
        
        HashedMap<Integer, Integer> value = new HashedMap<>();
        
        for (int i : my_array) {
        	
        	  if(value.isEmpty()) {
        		  
              	value.put(i, 1);
              	
              }
        	  
        	  else if(value.get(i)!=null && value.get(i)>1) {
        		  
        		  value.put(i, value.get(i)+1);
        		          		  
        	  }
        	  
        	  else {
        		  
        		  value.put(i, 1);
        	  }
		}
        
        Set<Integer> set = value.keySet();
        
        Iterator<Integer> iterator = set.iterator();
        
        if(iterator.hasNext()) {
        	
        	if(value.get(iterator.next())>1) {
        		
        		System.out.println("Duplicate value is" + iterator.next());
        	}
        	
        }
        	
        
        
        
        
        
      
	}

}
