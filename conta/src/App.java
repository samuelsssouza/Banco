import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Filho cls = new Filho ();
    Banco ban = new Banco ();
    Pai p = new Pai ();
    int a;
    String f;
      cls.calcularSaldoCaixa ();
    do
      {
	System.out.println ("digite 1 para titular ou digite 2 para adm");
	a = sc.nextInt ();

	switch (a)
	  {
	  case 1:
	    cls.senhaFilho ();
	    cls.saqueBanco ();
	    cls.restante ();
	    break;

	    case 2:p.senhaPai ();
	    cls.restante ();
	    cls.reporNotas ();
	    ban.nota ();
	    ban.reposicao ();
	    System.out.println ("Em caixa tem: " + ban.notaT50 +
				" notas de 50 Reais");
	    System.out.println ("Em caixa tem: " + ban.notaT20 +
				" notas de 20 Reais");
	    System.out.println ("Em caixa tem: " + ban.notaT10 +
				" notas de 10 Reais");
	    System.out.println ("Em caixa tem: " + ban.notaT2 +
				" notas de 2 Reais");

	    break;
	  }

	System.
	  out.println ("digite 1 para continuar ou digite 2 para acabar");
	a = sc.nextInt ();
      }
    while (a == 1);


  }
}