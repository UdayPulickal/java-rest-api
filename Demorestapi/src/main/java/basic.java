public class basic {
    public static void main(String[] args) {
        int num = 6174;
        int ans=num;
        int dig=0;
        int cnt=0;
        int sq=0;
        int numb=1;
        int c=0;
        while (ans!=0)
        {
        	ans=ans/10;
        	cnt++;
        }
    	//System.out.println("count="+cnt);
        ans=num;   	
        for (int i=cnt;i>0;i--)
        {
        c=ans%10;
        ans=ans/10;
        System.out.println("c="+c);
        System.out.println("ans="+ans);
        numb=1;
        for(int j=cnt;j>0;j--)
        {
       	numb=numb*c;
          }
        
        sq=sq+numb;
        cnt--;
     
        }
        System.out.println("square of number " + sq);
    }
}

