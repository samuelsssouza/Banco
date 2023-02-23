import java.util.Scanner;
public class Filho extends Banco{
    Scanner ler = new Scanner(System.in);
   int c;
    public int valor;
    public String f1= "kratusing";
    public int SF1= 300;
    public String f2="keios";
    public int SF2= 300;
    public String f3 = "bilizzard";
    public int SF3= 300;
    public String f4 = "wizarka";
    public int SF4= 300;
    public String f5 = "venenuh";
    public int SF5= 300;
    public int senha;
    public int saldo = 1640;
    public int saque;
    	int senha1 = 121212;
		int senha2 = 212121;
		int senha3 = 313131;
		int senha4 = 131313;
		int senha5 = 101010;
		int senha6 = 666666;
 
    
    public String Nome1(){
        f1="Kratusing";
        return f1;
    }
 
    public String Nome2(){
        f2 = "keios";
        return f2;
    }
   
    public String Nome3(){
        f3 = "Bilizzard";
        return f3;
    }
   
    public String Nome4(){
        f4 = "Wizarka";
        return f4;
    }
   
    public String Nome5(){
        f5 = "Venenuh";
        return f5;
    }
    public int senhaFilho(){
        do{
        System.out.println("Digite sua senha Titular: ");
        	senha = ler.nextInt();
     if (senha == senha1){
         System.out.println("Bem vindo " + f1 );
              System.out.println("O seu saldo é " + SF1 + f1 );
               System.out.println("O seu saldo digite a quantidade que deseja sacar" );
                saque = ler.nextInt();
              
              c = SF1 - saque;
              System.out.println("O seu saldo agora é " + c + f1 );
     }
     else if(senha == senha2){
         System.out.println("Bem vindo " + f2 );
              System.out.println("O seu saldo é " + SF2 + f2 );
               System.out.println("O seu saldo digite a quantidade que deseja sacar" );
                saque = ler.nextInt();
              
              c = SF2 - saque;
              System.out.println("O seu saldo agora é " + c + f1 );
        }
        else if(senha == senha3){
            System.out.println("Bem vindo " + f3 );
              System.out.println("O seu saldo é " + SF3 + f3 );
               System.out.println("O seu saldo digite a quantidade que deseja sacar" );
                saque = ler.nextInt();
              c = SF3 - saque;
              System.out.println("O seu saldo agora é " + c + f4 );
            
        }
         else if(senha == senha4){
             System.out.println("Bem vindo " + f4 );
              System.out.println("O seu saldo é " + SF4 + f4 );
               System.out.println("O seu saldo digite a quantidade que deseja sacar" );
                saque = ler.nextInt();
        c = SF4 - saque;
              System.out.println("O seu saldo agora é " + c + f4 );
         }
          else  if(senha == senha5){
             System.out.println("Bem vindo " + f5 );
              System.out.println("O seu saldo é " + SF5 + f5 );
               System.out.println("O seu saldo digite a quantidade que deseja sacar" );
                saque = ler.nextInt();
               c = SF5 - saque;
              System.out.println("O seu saldo agora é " + c + f5 );
         }
            
             }while (senha != senha1 && senha != senha2 && senha != senha3 && senha != senha4 && senha != senha5 && senha != senha6);
    
        return 0;
    }
        
        public double SaldoBanco(){
        
        return saldo;
    }
    
    
    public int saqueBanco(){
        if(saque > 300){
            System.out.println("Indisponivel");
        
        }
        return saque;
    }
    
    public void calcularSaldoCaixa(){
        saldo = 1640;
        c = saldo - saque;
        
     System.out.println("O saldo do CaixaEletronico é: " + c);
     
    }
    public void restante(){
        if(saldo >= saque){
            c = saldo - saque;
             System.out.println("O restante do saldo do caixa é:" + c);
        }
    }
    public int reporNotas(){
         System.out.println("Complete o saldo do caixa: " +saldo);
                    valor = ler.nextInt();
                    System.out.println("o caixa foi abastecido");
       return saque;
    }
        
        
        
        }