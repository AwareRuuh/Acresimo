import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner (System.in);
    double valorTotal, porcentagem;

    System.out.println("Sua compra saí pelo total de R$ 578,00");
    System.out.println("");
    System.out.println("Qual a forma de pagamento desejada? [1] Débito [2] Crédito: ");
    int pagamentoInt = sc1.nextInt(); 
    String pagamento = "";

       if (pagamentoInt == 1) {
        pagamento = "Débito";
         System.out.println("Compra finalizada no valor de R$578,00! Obrigada =D");
    } else if (pagamentoInt == 2) {
         valorTotal = 578;
         porcentagem = (0.37*valorTotal);
         pagamento = "Crédito";
         System.out.println("Possui acréssimo de 37%. Totalizando R$" + ( porcentagem + valorTotal) );
    }

  }
}