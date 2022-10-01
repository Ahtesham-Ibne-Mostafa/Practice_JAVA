// This code contains basic for loop, for-eash loop and array 

// Creating array class
public class Arrays {
    public static void main (String[] args){
        int []a = new int [6];
        
        
        
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        a[5]=60;
        
        System.out.println(a[0]);
        
        // for loop
        for (int i=0; i<6 ; i++)
            System.out.println(a[i]);
        
        System.out.println("-------------------");
        
        // for-each loop
        for (int x : a)
            System.out.println(x);
        
        
        System.out.println(a.length);
    }
}
    
