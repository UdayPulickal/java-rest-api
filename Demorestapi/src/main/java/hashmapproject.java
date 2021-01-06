import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
/* Name of the class has to be "Main" only if the class is public. */
public class hashmapproject 
{ 
    public static void main(String args[]) 
    { 
        //----------hashtable ------------------------- 
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101,"Ajay"); 
        ht.put(102,"Ajay"); 
        ht.put(103,"Ravi"); 
        ht.put(104,"Rahul"); 
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
  
        //----------------hashmap-------------------------------- 
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
        hm.put(101,"Amit"); 
        hm.put(102,"Amit");  // hash map allows duplicate values 
        hm.put(103,"Vijay"); 
        hm.put(104,"Rahul"); 
        System.out.println("-----------Hash map-----------"); 
        for (Map.Entry m:hm.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
    } 
} 