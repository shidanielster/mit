public class InsertionSort
{
    public static void sort(List<T extends< ? super T> array) 
    {
        for(int i = 1; i < array.size(); i ++ ) 
        {
            Comparable<? super T> key = array.get(i);
            int j=i;
            for(; j>0 && key.compareTo(array.get(j-1))<0;j--)
            {
                array.set(j,array.get(j-1));
            }
            array.set(j,key);
        }
    }
    
    public static void main(String [] args )
    {
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(3);
        array.add(2);
        
        sort(array);
        
    }
}
