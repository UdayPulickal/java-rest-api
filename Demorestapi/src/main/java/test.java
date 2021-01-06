import java.util.Arrays;
public class test {
	    public static void main(String[] args) {
	    int x[]= new int[10];
	    int cnt=675;
	    x[9]=cnt;
	    int j=0;
	    while (cnt>0)
	    {
	    x[j]=cnt%10;
	    cnt=cnt/10; 	
	    j++;
	    }  
	    for (int i=j;i>0;i--)
	    {
	    	x[7]=1;
	    	for (int k=i;k>0;k--)
	    	{
	    		x[7]=x[7]*x[j-i];
	    	}
	    	x[8]=x[8]+x[7];
	    }
	    if(x[8]==x[9])
	    {
	    System.out.println("entered number is disarian");
	    }
	    else
	    {
	System.out.println("entered number is not disarian");

	    }
	    }
}