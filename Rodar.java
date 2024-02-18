package conta_bancaria;

import java.util.Scanner;

public class Rodar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("entre com suas informações");
           System.out.print("Numero de conta:");
           int number = sc.nextInt();
           sc.nextLine();
           System.out.print("Nome:");
           String name = sc.nextLine();
           System.out.print("Valor inicial");
           double balance = sc.nextDouble();
           sc.nextLine();
           System.out.print("limite de saque:");
           Double withdraw_limit = sc.nextDouble();
           sc.nextLine();
           Account ac = new Account(number, balance, withdraw_limit, name);

           System.out.print("deseja sacar ou depositar");
           char resp = sc.next().toLowerCase().charAt(0);
           sc.nextLine();
           if (resp == 's') {
               System.out.print("Qual valor deseja sacar:");
               double value = sc.nextDouble();
               sc.nextLine();
               ac.withdraw(value);
           }
           if (resp == 'd'){
               System.out.print("Qual valor deseja depositar:");
               double value = sc.nextDouble();
               sc.nextLine();
               ac.deposit(value);
           }
           System.out.println("Valor em conta final: " + ac.getBalance());
       }catch (ModeAccount e ){
           System.out.println(e.getMessage());
       }
       catch (RuntimeException e){
           System.out.println("erro");
       }
    }
}
