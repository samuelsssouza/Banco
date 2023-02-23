import java.util.Scanner;
public class Pai extends Filho{
    Scanner r = new Scanner(System.in);
    public int senha;
    public double saldo;
    public String nome = "Jezzy";
    
    public double transf;
    
    public int senhaPai(){
      	do{
      	System.out.println("Digite sua senha Adm " + nome);
      	senha = r.nextInt();
      	
      	 switch (senha){
         case 999989:
         System.out.println("Acesso permitido" + nome );
            break;
            
        default:
            System.out.println("Senha Incorreta" + nome);
            break;
         }
      	
      	
      	}while(senha != 999989);
        return senha;
      }  
 
  
    
   
}