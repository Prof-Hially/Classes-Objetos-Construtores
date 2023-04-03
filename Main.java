
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar um objeto a partir da classe Conta - instanciação
        //metodo construtor padrao
        Conta conta1 = new Conta(1000.0);
        
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        conta1.setNome(nome);     
        System.out.println("Digite a conta ");
        String conta = sc.nextLine();
        conta1.setConta(conta);
        System.out.println("Digite a agencia ");
        String agencia = sc.nextLine();
        conta1.setAgencia(agencia);
        
        System.out.println(conta1.getNome());
        System.out.println(conta1.getAgencia());  
        System.out.println(conta1.getConta()); 
        
        conta1.depositar(1000.0);
        System.out.println("Saldo atual ");
        System.out.println(""+conta1.getSaldo());
        
        conta1.sacar(5000.0);
        
        System.out.println("Saldo atual ");
        System.out.println(""+conta1.getSaldo());
         
        
        
       
        
    }
    
}
