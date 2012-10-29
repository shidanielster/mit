import java.util.*;




public class InsertionSort
{
    public static  <T extends Comparable<? super T>>  void 
            sort(T[]  array) 
    {
        for(int i = 1; i < array.length; i ++ ) 
        {
            T key = array[i];
            int j=i;
            for(; j>0 && key.compareTo(array[j-1])<0;j--)
            {
                array[j]=array[j-1];
            }
            array[j]=key;
        }
    }
    

    
    public static void main(String [] args )
    {
        Integer[] array = {1,3,2};
        
        sort(array);
        
    }

    
}

