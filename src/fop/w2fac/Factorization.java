package fop.w2fac;

public class Factorization extends MiniJava {

    public static void main(String[] args){
	        int x=readInt();
        int k=2;
        while (x!=1)
        {
            if(x%k==0)
            {
                if(x==k){
                x=x/k;
                
                writeConsole(k);}
                else {
                    x/=k;
                    writeConsole(k+" ");
                }
            }
            else {k++;}
        }
    }
}
