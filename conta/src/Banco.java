import java.util.Scanner;
public class Banco {
    public double saldo;
    public double resto;
    public double nt2;
    public double nt10;
    public double nt20; 
    public double nt50;
    public double notaT2=20;
    public double notaT10=20;
    public double notaT20=20;
    public double notaT50=20;
    
    public void nota(){
        if(saldo>=50 && notaT50>0){ 
            if((int)saldo/50>notaT50){
                nt50=notaT50;
                resto=saldo-(nt50*50);
                saldo=resto;
            }
            else{
                nt50=(int)saldo/50;
                resto=saldo%50;
                saldo=resto;
            }
            notaT50-=nt50;
        }
        if(saldo>=20 && notaT20>0){
            if((int)saldo/20>notaT20){
                nt20=notaT20;
                resto=saldo-(nt20*20);
                saldo=resto;
            }
            else{
                saldo=(int)saldo/20;
                resto=saldo%20;
                saldo=resto;
            }
            notaT20-=nt20;
        }
        if(saldo>=10 && notaT10>0){
            if((int)saldo/10>notaT10){
                nt10=notaT10;
                resto=saldo-(nt10*10);
                saldo=resto;
            }
            else{
                nt10=(int)saldo/10;
                resto=saldo%10;
                saldo=resto;
            }
            notaT10-=nt10;
        }
        if(saldo>=2 && notaT2>0){
            if((int)saldo/2>notaT2){
                nt2=notaT2;
                resto=saldo-nt2*2;
                saldo=resto;
            }
            else{
                nt2=(int)saldo/2;
                resto=saldo%2;
                saldo=resto;
            }
            notaT2-=nt2;
        }
       
    }
    
    public void reposicao(){
        notaT2=20;
	    notaT10=20;
	    notaT20=20;
	    notaT50=20;
	    
	 
    }
}